package dao;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerDAO {

	public void insertCustomer(CustomerDTO cus);
	public List<CustomerDTO> selectCustomerList();
	public List<CustomerDTO> selectCustomers(String searchWord);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	
	public int countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	
	public void updateCustomer(CustomerDTO cus);
	public void deleteCustomer(CustomerDTO cus);
}
