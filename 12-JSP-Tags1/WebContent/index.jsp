<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:orange">
        <h1>Home Page</h1>
        <br>
        <h1>Declaration Tag</h1>
       <%!int a=10 ;
          String name="manjeet Singh";
          %>
          <h1>Expression Tag</h1>
         <h1>Value is: </h1>
          <%= a %>
          <br>
        <h1>name is: </h1>
         <%=name %>
         
         
         <h1>Scriptlet Tag</h1>
         
         <%  int sum=10+30;
            out.println("sum is : "+sum);
       
            int sub=60-sum;            
              out.println("sub: "+sub);
         %>
         
         
         <%  int multi=10*10;
              int divide=20/2;
          %>
          
          <h1 style="color:red">multi is: <%=multi %></h1>
           <h1 style="color:blue">divide is: <%=divide %></h1>
        
        
</body>
</html>