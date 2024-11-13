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
           response.sendRedirect("http://www.google.com");%>
          <%
          String name=request.getParameter("username");
            out.println("name is : "+name);
          %>
          
          <%session.removeAttribute("myname");%>
          <%String name2=(String)session.getAttribute("myname");
              out.println("after remove"+name2);
          %>
</body>
</html>