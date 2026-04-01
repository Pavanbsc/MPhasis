<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }

    h2 {
        margin-bottom: 20px;
    }

    div {
        margin-top: 20px;
    }

    a {
        text-decoration: none;
        margin: 0 15px;
        padding: 8px 14px;
        background-color: #007bff;
        color: white;
        border-radius: 4px;
        font-size: 14px;
    }

    a:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
<center>
<h2>Product Manager App</h2>
 <div>
  <a href="homecontroller">HOME</a>
    <a href="logincontroller">Sign In</a>
    <a href="productcontroller"> Products</a>
    <a href="weathercontroller?city=Pune">Pune Weather</a>
    <a href="weathercontroller?city=Delhi">Delhi Weather</a>
    
 </div>
 </center>
  
</body>
</html>	

