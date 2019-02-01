package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.EmployeeDTO;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{

	public CreateCommand(HttpServletRequest request,
			HttpServletResponse response) {
		super(request, response);
		EmployeeDTO emp = new EmployeeDTO();
		emp.setManager(request.getParameter("manager"));
		emp.setBirthDate(request.getParameter("birthday"));
		emp.setName(request.getParameter("name"));
		emp.setPhoto(request.getParameter("photo"));
		emp.setNotes(request.getParameter("notes"));
		EmployeeServiceImpl.getInstance().registEmployee(emp);	
	}
}
