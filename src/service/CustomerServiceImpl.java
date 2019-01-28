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
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList() {
		// TODO Auto-generated method stub
		return dao.selectCustomerList();
	}

	@Override
	public List<CustomerDTO> retrieveCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectCustomers(searchWord);
	}

	@Override
	public CustomerDTO retrieveCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectCustomer(searchWord);
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return dao.countCustomers();
	}

	@Override
	public boolean existCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existCustomer(searchWord);
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
