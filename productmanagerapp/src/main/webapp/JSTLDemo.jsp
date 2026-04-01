<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IJSTL Demo</title>
</head>
<body>
  <h1>JSTL Demo</h1>
  
  <c:set var="city" value="Pune"/>
  <h3>City : <c:out value="${city}"/> </h3>
  
  <hr>
  
  <%
  List<String> cities= new ArrayList();
  cities.add("Pune");
  cities.add("Dharwad");
  cities.add("Belgaum");
  cities.add("Hubli");
  pageContext.setAttribute("cities", cities);
  %>
  
  <h2>CITIES</h2>
  <ol>
   <c:forEach items="${cities}" var="ct">
     <li> ${ct} </li>
   </c:forEach>
  </ol>
</body>
</html>