<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Bogdan
  Date: 01.05.2017
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<table>
    <!-- here should go some titles... -->
    <h2 align="center">${product.category.categoryName}->${product.productName}</h2>
    <p style="margin-top: 50px">description - ${product.description}</p>
    <p>price - ${product.price}</p>


</table>
</body>
</html>
