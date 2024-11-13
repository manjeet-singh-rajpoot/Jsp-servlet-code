package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   
		           String name=req.getParameter("nm");
		           
		           PrintWriter out=resp.getWriter();
		           
		            Cookie[] ck=req.getCookies();
		            
		           resp.setContentType("text/html");
		           out.println("Welcome to Servlet2: ");
		           out.println("<br><h1>Name is :"+ ck[0].getValue()+"</h1>");
		           
		           
	}
      
	  
	
	
}
