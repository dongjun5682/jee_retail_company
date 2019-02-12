package pooxy;

import javax.servlet.http.HttpServletRequest;

import command.Receiver;
import lombok.Data;
import service.CustomerServiceImpl;
@Data
public class Pagination implements Capable{
	private String pageNum,pageSize,
			blookSize,startRow,
			endRow,start,
			startPage,endPage,
			prevBlock,nextBlock;
	private int totalCount;
	private boolean existPrev, existNext;
	
	@Override
	public void carryOut() {
		HttpServletRequest request = Receiver.cmd.getRequest();
		System.out.println("pageSize : "+ request.getParameter("page_size"));
		System.out.println("page_num : "+ request.getParameter("page_num"));
		
		this.pageSize = (request.getParameter("page_size") == null)	? "5" : request.getParameter("page_size");
		this.pageNum = (request.getParameter("page_num") == null) ? "1" : request.getParameter("page_num");
		this.totalCount = CustomerServiceImpl.getInstance().countCustomers();
		this.startRow = String.valueOf(totalCount-((Integer.parseInt(pageNum)-1) * Integer.parseInt(pageSize)));
		System.out.println("startRow : "+ startRow);
		this.endRow = String.valueOf(Integer.parseInt(startRow)-(Integer.parseInt(pageSize)-1));
		System.out.println("endRow : "+ endRow);
	
	}
}
