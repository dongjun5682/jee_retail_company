package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Carrier;
import command.Receiver;
import enums.Action;
import service.EmployeeService;
import service.EmployeeServiceImpl;

@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeService employeeService = EmployeeServiceImpl.getInstance();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Receiver.init(request, response);
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case MOVE:
			Carrier.forward(request, response);
			break;
		case REGISTER:
			Carrier.forward(request, response);
			break;
		}

	}
}
