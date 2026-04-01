<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Greetings!!</title>
</head>
<body>

<%
 String name = request.getParameter("name");
%>

<h3>Welcome to JSP > <%= name %> !!</h3>

</body>
</html>