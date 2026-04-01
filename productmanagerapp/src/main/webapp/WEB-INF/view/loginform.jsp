<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet">
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<center>
    <h3>Sign Up</h3>
<div>
    <form action="logincontroller" method="post">
        <div>
            <input type="text" placeholder="username" name="lg">
        </div>
        <div>
            <input type="password" placeholder="password" name="pw">
        </div>
        <div>
            <button type="submit">Sign In</button>
        </div>
         <p>
         <%= request.getAttribute("msg") %>
         </p>
    </form>
</div>
</center>
</body>
</html>