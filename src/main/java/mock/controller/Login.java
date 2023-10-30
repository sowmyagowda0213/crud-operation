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


@WebServlet("/detail")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String pwd=req.getParameter("password");
		
			if(id.equals("test@sunbasedata.com") && pwd.equals("Test@123")) {
				resp.getWriter().print("WELCOME TO SUNDATABASE");

			}
			else {
				resp.getWriter().print("please enter proper credentials");
			}
			
//			RequestDispatcher rd=req.getRequestDispatcher("fetchall");
//			rd.forward(req, resp);
			resp.sendRedirect("fetchall");
		}
	}


	
