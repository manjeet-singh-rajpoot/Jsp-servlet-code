package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		   String name=req.getParameter("nm");
		   
		   PrintWriter out=resp.getWriter();
		   resp.setContentType("text/html");
		   
		   out.println("Welcome to Servlet2: "+name);
		
	}

	  
	
	
}
