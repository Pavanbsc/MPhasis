<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="my" uri="http://mphasis.com/tags/my" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Greeting Tag Demo</title>
</head>
<body>
    <p><my:greet name="John" timeOfDay="morning"/></p>
    <p><my:greet name="Sarah"/></p>
    <p><my:greet name="Mike" timeOfDay="evening"/></p>
</body>
</html>