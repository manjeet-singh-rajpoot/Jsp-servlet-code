<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	   <%out.print("hello world"); %>
	   
	   
	   <form action="next.jsp">
	      <label>Enter name: </label><br>
	      <input type="text" name="username"><br><br>
	      <button type="submit">Submit</button>
	   </form>
	   
	   
	   <form action="welcome">
	      <label>Enter name: </label><br>
	      <input type="text" name="username"><br><br>
	      <button type="submit">Submit</button>
	   </form>
	   
	   <% session.setAttribute("myname","hii manjeet singh"); %>
	   
	    <form action="welcome">
	      <label>Enter name: </label><br>
	      <input type="text" name="username"><br><br>
	      <button type="submit">Submit</button>
	   </form>
	   
</body>
</html>