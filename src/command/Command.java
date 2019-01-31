package command;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
@Data
public class Command implements Order{
	
	protected HttpServletRequest request; //요청을 캡슐화하는 것이다 
	protected String action,domain,page,view;

	@Override
	public void execute() {
		System.out.println("5번 view setting-----------------------");
		this.view ="/WEB-INF/view/"+domain+"/"+page+".jsp";
	}
}
