package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String name=req.getParameter("nm");
		  
		      Cookie ck=new Cookie("nm",name);
		       
		      resp.addCookie(ck);
		  
		      PrintWriter out=resp.getWriter();
		      resp.setContentType("text/html");
		       out.println("<h1>Welcome to Home Page</h1>");
		       out.println("<h1>Name is : "+name+"</h1>");
		       
		       
		       out.println("<br><br> <a href='servlet2'>Go to Servlet2</a>");
		       
		       
	}

	   
	    
}
