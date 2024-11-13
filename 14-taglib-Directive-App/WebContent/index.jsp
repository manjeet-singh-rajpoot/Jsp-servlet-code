<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
          <h1>Hello World</h1>
     <c:set var="name" value="Manjeet">  </c:set>
        <c:out value="${name}"></c:out>
        
        <c:if test="3>2">
           <h1>True</h1>
        </c:if>
        
       
        
</body>
</html>