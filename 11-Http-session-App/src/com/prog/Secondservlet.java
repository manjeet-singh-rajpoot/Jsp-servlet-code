package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet2")
public class Secondservlet extends HttpServlet {
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  HttpSession session=req.getSession();
		    
		  String name=(String)session.getAttribute("username");
	       
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
	     
		  out.println("<h1>Name: "+name+"</h1>");
		  
		  
	}
    
	
	
}
