<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
            <h1>this is page2</h1>
            <a href="page3.jsp">go to page3</a>
            
            <%response.sendRedirect("page3.jsp"); %>
</body>
</html>