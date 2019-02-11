package service;

import java.util.List;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import domain.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {

	private static CustomerServiceImpl instance = new CustomerServiceImpl();
	public CustomerServiceImpl() {
		dao = CustomerDAOImpl.getInstance();
	}
	
	public static CustomerServiceImpl getInstance() {
		return instance;
	}
	
	CustomerDAO dao;
	
	
	@Override
	public void registCustomer(CustomerDTO cus) {
		dao.insertCustomer(cus);
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList() {
		return dao.selectCustomerList();
	}

	@Override
	public List<CustomerDTO> retrieveCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectCustomers(searchWord);
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		return dao.selectCustomer(cus);
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return dao.countCustomers();
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
		return dao.existCustomerID(cus);
	}

	@Override
	public void modifyCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		
	}

}
