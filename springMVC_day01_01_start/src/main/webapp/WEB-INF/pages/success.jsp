<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/06/03
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>入门程序成功了!!!</h3>
    <%--request域--%>
    ${ requestScope.name } <br>

    ${ name }<br>

    <%--session域--%>
    ${ sessionScope }<br>
</body>
</html>
