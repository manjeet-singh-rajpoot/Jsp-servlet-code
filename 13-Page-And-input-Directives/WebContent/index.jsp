<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="java.util.*" %>
 <%@page session="false" %>
 <%@page isELIgnored="false" %>
 <%@page errorPage="error.jsp"%>
 <%@page contentType="text/html" %>
 <%@page info="true"%>
 <%@page language="java" %>
 <%@page isErrorPage="true" %>
 <%@page autoFlash="false"%>
 <%@page buffer="16kb"%>
 <%@page extends="SomePackage.someclass"%>
 <%@page isThreadSafe="false"%>
 <%@page isScriptingEnable="false"%>
 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Page and input Directory</h1>
         <%=new Date().toString() %>
         
         
         <%@include file="header.jsp"%>
</body>
</html>