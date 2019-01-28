package dao;

import java.util.List;

import domain.EmployeeDTO;

public class EmployeseDAOImpl implements EmployeeDAO{

	private static EmployeseDAOImpl instance = new EmployeseDAOImpl();
	private EmployeseDAOImpl() {

	}
	public static EmployeseDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
