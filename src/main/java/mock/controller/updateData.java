package mock.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mock.dao.Customerdao;
import mock.dto.Customer;

@WebServlet("/update")
public class updateData extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String fn=req.getParameter("firstname");
		String ln=req.getParameter("lastname");
		String st=req.getParameter("street");
		String adrs=req.getParameter("address");
		String ci=req.getParameter("city");
		String cs=req.getParameter("state");
		String ce=req.getParameter("email");
		String cp=req.getParameter("phone");
		long cuno=Long.parseLong(cp);
	    
		
		System.out.println(fn+ln+st+adrs+ci+cs+ce+cp);
		Customer cus=new Customer();
		cus.setFirstname(fn);
		cus.setLastname(ln);
		cus.setStreet(st);
		cus.setAddress(adrs);
		cus.setCity(ci);
		cus.setState(cs);
		cus.setEmail(ce);
		cus.setPhone(cuno);
		
		
		Customerdao cusdao=new Customerdao();
		cusdao.updatedata(cus);
		
		}
}
