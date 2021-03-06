package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vender;
import factory.DatabaseFactory;
import pooxy.Pagination;

public class CustomerDAOImpl implements CustomerDAO{

	private static CustomerDAOImpl instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {	}
	public static CustomerDAOImpl getInstance() {
		return instance;
	}


	@Override
	public void insertCustomer(CustomerDTO cus) {
	try {
		Connection conn = DatabaseFactory.createDatabase(Vender.ORACLE).getConnection();
		PreparedStatement pstmt = conn.prepareStatement(CustomerSQL.SIGNUP.toString());
		pstmt.setString(1,cus.getCustomerId());
		pstmt.setString(2,cus.getCustomerName());
		pstmt.setString(3,cus.getPassword());
		pstmt.setString(4,cus.getAddress());
		pstmt.setString(5,cus.getCity());
		pstmt.setString(6,cus.getPostalCode());
		pstmt.setString(7,cus.getSsn());
		pstmt.setString(8,cus.getPhone());
		int rs = pstmt.executeUpdate();
		if(rs == 1 ){
			System.out.println("회원 등록 성공");
		}else{
			System.out.println("회원 등록 실패");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	@Override
	public List<CustomerDTO> selectCustomerList(Pagination page) {
		List<CustomerDTO> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = DatabaseFactory
			.createDatabase(Vender.ORACLE)
			.getConnection()
			.prepareStatement(CustomerSQL.LIST.toString());
				pstmt.setString(1,page.getEndRow());
				pstmt.setString(2,page.getStartRow());
			ResultSet rs = pstmt.executeQuery();
			CustomerDTO cus = null;
			while (rs.next()) {
				cus = new CustomerDTO();
				cus.setRnum(rs.getString("RNUM"));
				cus.setAddress(rs.getString("ADDRESS"));
				cus.setCity(rs.getString("CITY"));
				cus.setCustomerId(rs.getString("CUSTOMER_ID"));
				cus.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cus.setPassword(rs.getString("PASSWORD"));
				cus.setPhone(rs.getString("PHONE"));
				cus.setPhoto(rs.getString("PHOTO"));
				cus.setPostalCode(rs.getString("POSTAL_CODE"));
				cus.setSsn(rs.getString("SSN"));
				list.add(cus);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<CustomerDTO> selectCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(CustomerDTO cus) {
		CustomerDTO temp = null;
		try {
			PreparedStatement pstmt = DatabaseFactory
			.createDatabase(Vender.ORACLE)
			.getConnection()
			.prepareStatement(CustomerSQL.SIGNIN.toString());
			pstmt.setString(1,cus.getCustomerId());
			pstmt.setString(2,cus.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				temp = new CustomerDTO();
				temp.setAddress(rs.getString("ADDRESS"));
				temp.setCity(rs.getString("CITY"));
				temp.setCustomerId(rs.getString("CUSTOMER_ID"));
				temp.setCustomerName(rs.getString("CUSTOMER_NAME"));
				temp.setPassword(rs.getString("PASSWORD"));
				temp.setPostalCode(rs.getString("POSTAL_CODE"));
				temp.setSsn(rs.getString("SSN"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int countCustomers() {
		int count = 0;
		try {
			PreparedStatement pstmt = DatabaseFactory
					.createDatabase(Vender.ORACLE)
					.getConnection()
					.prepareStatement("SELECT COUNT(*) AS COUNT FROM CUSTOMERS");
			 ResultSet rs = pstmt.executeQuery();
			 while (rs.next()) {
				count = Integer.parseInt(rs.getString("count"));
			}
			 System.out.println("count 값 : "+ count);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
		boolean exist = false;
		try {
			PreparedStatement pstmt = DatabaseFactory
			.createDatabase(Vender.ORACLE)
			.getConnection()
			.prepareStatement(CustomerSQL.SIGNIN.toString());
			pstmt.setString(1,cus.getCustomerId());
			pstmt.setString(2,cus.getPassword());
			if(pstmt.executeQuery().next()){
				exist = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exist;
	}

	@Override
	public void updateCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

}
