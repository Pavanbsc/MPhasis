<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
<center>
	<h3>Application</h3>
	<form action="processapp.jsp" method="post">
		<div>
		
		<div>
			<label>Full Name</label> 
			<input type="text" name="fname">

		</div>
		<div>
			<label>Email </label> 
			<input type="text" name="email">

		</div>
		<div>
			<label>Cell </label> 
			<input type="text" name="cellno">

		</div>
		<button type="submit" >Apply</button>
		
		
		</div>
	</form>
</center>
</body>
</html>