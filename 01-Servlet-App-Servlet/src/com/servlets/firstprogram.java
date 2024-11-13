package com.servlets;
import java.io.IOException;
//import java.io.PrintStream;
import java.sql.Date;

//import javax.servlet.*;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class firstprogram implements Servlet{

      ServletConfig con;	
	@Override
	public void destroy() {
	System.out.println("destroy call");
	}

	@Override
	public ServletConfig getServletConfig() {
		return con;
	}

	@Override
	public String getServletInfo() {
		return "Java is fast programming language";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init call");
	  this.con = config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service call 2");
		res.setContentType("text/html");
		java.io.PrintWriter out=res.getWriter();
		out.println("welcome to servlet");
		out.println("Today time: "+new Date(00).toString());
		out.println(getServletInfo());
		out.println(getServletConfig());
		//out.println("hii raj I love you");
		
		
		
	}

}
