package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class firstapplication extends HttpServlet{
  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String email=req.getParameter("username");
		  String password=req.getParameter("password");
		    
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  
		  RequestDispatcher rd;
		  
		  
		  if("manjeetsingh@gmail.com".equals(email) && "manjeet".equals(password)) {
			  
			  resp.sendRedirect("servlet2");
			  
		  }else {
			  out.println("<h1>Invalid Email</h1>");
			  rd=req.getRequestDispatcher("/index.html");
			  rd.include(req, resp);
		  }
		  
	}

	
	
	
	
          
}
