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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  int fn=Integer.parseInt(req.getParameter("fn"));
		  int sn=Integer.parseInt(req.getParameter("sn"));
		  
		  
		  int sum=(int)req.getAttribute("s");
		  
		 
		  
		  int multi=fn*sn;
		  
		  
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  
		  out.println("<h1> Sum is : "+sum+"</h1>");
		  out.println("<h1>multi is: "+multi+"</h1>");
		  
	}

}
