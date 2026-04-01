<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="WEB-INF/greettag.tld" prefix="mphasis" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Custom Tag</title>
</head>
<body>
    
    <h3>
      	<mphasis:greet fname="Basya"/>
    </h3>
     
    <h3>
      	<mphasis:greet/>
    </h3>
    
     
    <h3>
      	<util:uppercase>This is a Demo Tag</util:uppercase>
    </h3>
    
</body>
</html>