package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String email=req.getParameter("email");
		  String pwd=req.getParameter("password");
		
		        resp.setContentType("text/html");
		        
		        PrintWriter out=resp.getWriter();
		        
		        out.println("<h1>Welcome To Home Page</h1>");
		        
		        out.println("<h4>your Email id is : "+email+"</h4>");
		        out.println("<h4>your Password is : "+pwd+"</h4>");
		        
		
	}

}
