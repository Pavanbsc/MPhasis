<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.mphasis.productmanagerapp.model.ProductModel" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Products page</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<center>

    <h3>Products</h3>

    <table border="2" width="500" style="border-collapse: collapse;">
        <tr>
            <th>Name</th>
            <th>Id</th>
            <th>Price</th>	
        </tr>

        <c:forEach var="p" items="${products}">
            <tr>
                <td>${p.name}</td>
                <td>${p.id}</td>
                <td>${p.price}</td>
            </tr>
        </c:forEach>
    </table>

    <h4 style="margin-top:20px;">Add Product</h4>

    <form action="productcontroller" method="0" width="500" style="border-collapse: collapse;">
            <tr>
                <td><input type="text" name="name" placeholder="Name"></td>
                <td><input type="text" name="id" placeholder="Id"></td>
                <td><input type="number" step="0.01" name="price" placeholder="Price"></td>
            </tr>

            <tr>
                <td colspan="3" style="text-align:center;">
                    <button type="submit">ADD</button>
                </td>
            </tr>
        </table>
    </form>

</center>

</body>
</html>