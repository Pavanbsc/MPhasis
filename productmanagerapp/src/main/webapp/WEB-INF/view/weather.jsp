<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather App</title>
</head>
<body>

<h1>Weather Report</h1>
<h3> City : <%= request.getAttribute("city") %></h3>
<h3> Weather : <%= request.getAttribute("weather") %></h3>
</body>
</html>