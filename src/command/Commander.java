package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Action;

public class Commander {

	public static Command order(HttpServletRequest request, HttpServletResponse response) {
		Command cmd = null;
		System.out.println("3번 커맨드오더-----------------------");
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case MOVE:
			cmd = new MoveCommand(request,response);
			break;

		}
		return cmd;
	}

}
