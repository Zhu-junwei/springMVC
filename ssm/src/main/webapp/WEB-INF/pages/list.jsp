<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/07/01
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
list.jsp
<table border="1">
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>金额</th>
    </tr>
    <c:forEach items="${list}" var="account">
    <tr>
        <td>${account.id}</td>&emsp;&emsp;
        <td>${account.name}</td>
        <td>${account.money}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
