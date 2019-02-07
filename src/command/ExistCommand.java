package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command {
	public ExistCommand(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existEmployee(emp);
			if (exist) {
				System.out.println("접근 허용");

			} else {
				System.out.println("접근 불가");
				super.setDomain("employee");
				super.setPage("access");
				super.execute();
			}
			break;
		case SIGNIN:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerId(request.getParameter("customerId"));
			cus.setPassword(request.getParameter("password"));
			exist = CustomerServiceImpl.getInstance().existCustomer(cus);
			if(exist){
				System.out.println("로그인 성공");
			}else{
				System.out.println("로그인 실패");
				super.setDomain("customer");
				super.setPage("signin");
				super.execute();
			}
			break;
		default:
			break;
		}

	}
}
