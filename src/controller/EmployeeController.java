package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeService;
import service.EmployeeServiceImpl;

@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmployeeService employeeService = EmployeeServiceImpl.getInstance();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String empno = request.getParameter("empno");
		String manager = request.getParameter("manager");
		String ssn = request.getParameter("birthday");
		String content = request.getParameter("content");


		request.getRequestDispatcher("/WEB-INF/view/employee/main.jsp").forward(request, response);
		
		
		
	}
}
