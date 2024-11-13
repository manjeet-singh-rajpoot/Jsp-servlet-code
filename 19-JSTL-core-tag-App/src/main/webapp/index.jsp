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
           <h1>JSTL CORE TAGS</h1>
           <hr>
       <c:out value="manjeet singh"></c:out>
     <h1> <c:import url="navbar.jsp" var="data"></c:import>  </h1> 
     
       <c:out value="${data}"></c:out>
       
       
       <hr>
      
       <c:set var="result" value="${200*2}" scope="session"></c:set>
      <h1>
       before remove: 
       <c:out value="${result}"></c:out>
       <br>
       after remove:
       
       <c:remove var="result"/>
       
       </h1><hr><br>
       
       
       <c:catch var="exception">
               <%int a=2/0; %>
       </c:catch>
       
       <c:if test="${exception!=null}">
             <p>${exception}</p>
             <p>${exception.message}</p>
       </c:if>
       
       <hr>
        <c:set value="${20}" var="age">
        </c:set>
        
        <c:if test="${age>18}">
             <h1>Adult</h1>
        </c:if>
        
        
        <hr>
        
        <c:set value="${20}" var="age"></c:set>
        
        <c:choose>
          <c:when test="${age>18}">
              <h1>Adult:above 18</h1>
          </c:when>
          
           <c:when test="${age<18}">
              <h1>childhood:below 18</h1>
          </c:when>
           
            <c:otherwise>
              <h1>Invalid age</h1>
          </c:otherwise>
          
        </c:choose>
       <hr>
       
       <c:forEach var="num" begin="1" end="10">
          <c:out value="${num}"></c:out>
       </c:forEach>
       
       
       <hr>
       
       <c:forTokens items="Manjeet-Singh-Rajpoot" delims="-" var="newstr">
         <c:out value="${newstr}"></c:out><p>
       </c:forTokens>
       
       
       <hr>
       
       <c:url  value="/index.jsp" var="pageurl">
            <c:param name="email" value="manjeetrajpoot182200@gmail.com"></c:param>
            <c:param name="password" value="demo"></c:param>
       </c:url>
       
      <c:out value="${pageurl}"></c:out>
       
       <hr>
       
     
    
</body>
</html>