<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bogdan
  Date: 29.04.2017
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
</head>
<body>
<table>
    <!-- here should go some titles... -->
    <h2 align="center">${category.categoryName}</h2>
    <h4 style="margin-top: 50px">${category.description}</h4>
    <tr>
    </tr>
    <c:forEach var="product" items="${category.products}">
        <tr>
            <td>
                <a href="<c:out value="/product?id=${product.id}"/>">
                    <c:out value="${product.productName}"/>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
