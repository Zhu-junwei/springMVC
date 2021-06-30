<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/06/03
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <%--<link rel="icon" href="./favicon.ico" type="image/x-icon">--%>
    <link rel="shortcut icon" href="./favicon.ico">
</head>
<body>
    <h3>入门程序</h3>
    <%--
        ${pageContext.request.contextPath} 可以省略不写
    --%>
    <a href="/user/hello">入门程序(/user/hello)</a><br/>
    <a href="/user/hello2">入门程序(/user/hello2)</a><br/>

    <a href="/user/testParams?username">测试请求参数(/user/testParams?username)</a><br/>

    <a href="/user/testHeaders">测试请求头(/user/testHeaders)</a>

</body>
</html>
