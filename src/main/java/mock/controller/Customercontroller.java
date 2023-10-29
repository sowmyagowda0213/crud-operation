package mock.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import mock.dao.Customerdao;
import mock.dto.Customer;
@WebServlet("/add")
public class Customercontroller implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String cusfirstname=req.getParameter("firstname");
			String cuslastname=req.getParameter("lastname");
			String cusstreet=req.getParameter("street");
		String cusaddress=req.getParameter("address");
		String cuscity=req.getParameter("city");
			String cusstate=req.getParameter("state");
			String cusemail=req.getParameter("email");
			String cusphone=req.getParameter("phone");
			
			System.out.println("firstname: "+cusfirstname);
			System.out.println("lastname:" +cuslastname);
			System.out.println("street:" +cusstreet);
			System.out.println("address: "+cusaddress);
			System.out.println("city: "+cuscity);
			System.out.println("state: "+cusstate);
			System.out.println("email: "+cusemail);
			System.out.println("phone: "+cusphone);
			
			Customer customer=new Customer();
			customer.setFirstname(cusfirstname);
			customer.setLastname(cuslastname);
			customer.setStreet(cusstreet);
		    customer.setAddress(cusaddress);
		    customer.setCity(cuscity);
		    customer.setState(cusstate);
		    customer.setEmail(cusemail);
		    long cusno=Long.parseLong(cusphone);
		    customer.setPhone(cusno);
		    System.out.println(customer);
		    
		    Customerdao customerdao=new Customerdao();
		    customerdao.insert(customer);
		    
		    res.getWriter().println("firstname: "+cusfirstname);
		    res.getWriter().println("lastname: "+cuslastname);
		    res.getWriter().println("street: "+cusstreet);
		    res.getWriter().println("address: "+cusaddress);
		    res.getWriter().println("city: "+cuscity);
		    res.getWriter().println("state: "+cusstate);
		    res.getWriter().println("email: "+cusemail);
		    res.getWriter().println("phone: "+cusphone);
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
