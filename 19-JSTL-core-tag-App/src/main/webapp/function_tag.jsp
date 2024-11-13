<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored ="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<hr>
        <h1>Welcome to Function page</h1>
        
        <c:set var="str" value="manjeet singh rajpoot      "></c:set>
        
        <c:if test="${fn:contains(str,'rajpoot')}">
        <h4>rajpoot Is Found</h4>
        </c:if>
        <hr>
        
        <c:if test="${fn:contains(str,'singer')}">
           <h4>singer Is Found</h4>
        </c:if>
       
      <hr>
        <c:if test="${fn:containsIgnoreCase(str,'Rajpoot')}">
          <h2>Rajpoot Found</h2>
        </c:if>
        
        <hr>
        
        <c:if test="${fn:endsWith(str,'rajpoot')}">
        <h3>endsWith Found</h3>
        </c:if>
        
        <hr>
        
        <h3>String : ${fn:indexOf(str,'r')}</h3>
        
        <hr>
        
        <h3>length without trim : ${fn:length(str)}</h3>
        <hr>
       
        <c:set var="str2" value="${fn:trim(str)}"></c:set>
         
         <h4>length with trim: ${fn:length(str2)}</h4>
         
         <hr>
         
         <c:if test="${fn:startsWith(str,'manjeet')}">
         <h4>manjeet is founded..</h4>
         </c:if>
         
         <hr>
         
         
         <c:set var="str3" value="raj patel ji"></c:set>
         
         <c:set var="str4" value="${fn:split(str3,' ')}"></c:set>   
         <c:set var="str5" value="${fn:join(str4,'-')}"></c:set>
         ${str5}
         <hr>
         ${fn:toLowerCase(str3)}
         ${fn:toUpperCase(str3)}
        <hr>
        <h1>substring : </h1><br>
        ${fn:substring(str3,2,7)}
         <h1>substring after: </h1><br>
        ${fn:substringAfter(str3,'raj')}
         <h1>substring Before: </h1><br>
        ${fn:substringBefore(str3,'ji')}
        
        <hr>
        <h1>replace: </h1>
<br>

      ${fn:replace(str3,"patel","singh")}
      
              
</body>
</html>