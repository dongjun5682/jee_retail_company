package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {

	public void insertCustomer(CustomerDTO cus);
	public List<CustomerDTO> selectCustomerList();
	public List<CustomerDTO> selectCustomers(String searchWord);
	public CustomerDTO selectCustomer(String searchWord);
	
	public int countCustomers();
	public boolean existCustomer(String searchWord);
	
	public void updateCustomer(CustomerDTO cus);
	public void deleteCustomer(CustomerDTO cus);
}
