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
import service.CustomerService;
import service.CustomerServiceImpl;

@WebServlet("/customer.do")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	CustomerService customerService = CustomerServiceImpl.getInstance();
	
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
		Receiver.init(request, response);
		switch (Action.valueOf(Receiver.cmd.getAction().toUpperCase())) {
		case MOVE:
			Carrier.forward(request, response);
			break;

		default:
			break;
		}
	}
}

