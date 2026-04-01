<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process</title>
</head>
<body>

<% 
String fname=request.getParameter("fname");
String email=request.getParameter("email");
String cellno=request.getParameter("cellno");
%>
<h3>Thank You</h3>

<h4>Name: <%= fname %></h4>
<h4>Email: <%= email %></h4>
<h4>Cell No: <%= cellno %></h4>
</body>
</html>