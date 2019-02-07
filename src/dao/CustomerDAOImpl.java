package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vender;
import factory.DatabaseFactory;

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
	public List<CustomerDTO> selectCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existCustomer(CustomerDTO cus) {
		boolean exist = false;
		try {
			Connection conn = DatabaseFactory.createDatabase(Vender.ORACLE).getConnection();
			PreparedStatement pstmt = conn.prepareStatement(CustomerSQL.SIGNIN.toString());
			pstmt.setString(1,cus.getCustomerId());
			pstmt.setString(2,cus.getPassword());
			if(pstmt.executeQuery().next()){
				exist = true;
			}
		} catch (Exception e) {
			
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
