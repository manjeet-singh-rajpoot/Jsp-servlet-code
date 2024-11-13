<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
              <%
             // String name=config.getInitParameter("username");
              //out.println("name is : "+name);
              
             // String name=application.getInitParameter("username");
             // out.println("name is: "+name);
              %>
              
              <%String name2=(String)session.getAttribute("myname");
               out.print("name is : "+name2);
              %>
              <br>
              <br>
              <a href="next.jsp">Remove Attribute</a>
</body>
</html>