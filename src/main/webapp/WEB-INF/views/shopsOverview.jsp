<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Shops Overview</title>
</head>
<body>
<h1>Shops Overview</h1>
<table>
    <c:forEach items="${shops}" var="shop">
        <tr>
            <td>${shop.name}</td>
            <td>${shop.description}</td>
            <td>
                <c:forEach items="${shop.products}" var="product">
                    ${product.name}
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>