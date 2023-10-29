package mock.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mock.dao.Customerdao;
import mock.dto.Customer;


@WebServlet("/fetchall")
public class Fetchall extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Customerdao dao=new Customerdao();
		List<Customer> a=dao.fetchallll();
		resp.getWriter().print(a);
		req.setAttribute("objects", a);
		RequestDispatcher rd=req.getRequestDispatcher("customer.jsp");
				rd.forward(req, resp);
		
	}
}
