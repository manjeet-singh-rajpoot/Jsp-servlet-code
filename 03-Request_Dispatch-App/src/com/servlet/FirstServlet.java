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
public class FirstServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String em=req.getParameter("email");
		  String ps=req.getParameter("password");
		  resp.setContentType("text/html");
	      PrintWriter out=resp.getWriter();
	      
	         RequestDispatcher rd;  
	      
		  if("manjeetsingh@gmail.com".equals(em) && "manjeet".equals(ps)) 
		  {
			    
			  rd=req.getRequestDispatcher("/servlet2");
			  rd.forward(req, resp);
			  
		  }else{
			  out.println("<h1>Sorry invalid Email</h1>");
			  rd=req.getRequestDispatcher("/index.html");
			  rd.include(req, resp);
		  }
		  
	}
     
}
