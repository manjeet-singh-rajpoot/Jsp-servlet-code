package com.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class secondprogram extends GenericServlet{

	
	@Override
	public void service(ServletRequest reqs, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Generic Servlet called.....");
		
		resp.setContentType("text/html");
	
		java.io.PrintWriter out=resp.getWriter();
		out.println("Date: "+new Date(00).toString());
		
		
		
	}
	

}
