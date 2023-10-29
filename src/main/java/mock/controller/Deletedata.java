package mock.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import mock.dao.Customerdao;
import mock.dto.Customer;

@WebServlet("/def")
public class Deletedata extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("primarykey");
		Customerdao dao=new Customerdao();
		dao.deleteData(id);
		
	
		List<Customer> list=dao.fetchallll();
		req.setAttribute("objects", list);
		
		RequestDispatcher rd=req.getRequestDispatcher("customer.jsp");
		rd.forward(req, res);
		
}
}
