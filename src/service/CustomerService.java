package service;

import java.util.List;

import domain.CustomerDTO;
import pooxy.Pagination;

public interface CustomerService {

	public void registCustomer(CustomerDTO cus);
	public List<CustomerDTO> bringCustomerList(Pagination page);
	public List<CustomerDTO> retrieveCustomers(String searchWord);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	
	public int countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	
	public void modifyCustomer(CustomerDTO cus);
	public void removeCustomer(CustomerDTO cus);
}
