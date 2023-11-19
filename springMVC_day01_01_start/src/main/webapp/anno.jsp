<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/06/14
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>anno</title>
</head>
<body>
    <a href="${pageContext.request.contextPath}/anno/testRequestParam?username=朱俊伟">RequestParam(参数username)</a><br>
    <a href="${pageContext.request.contextPath}/anno/testRequestParam?name=朱俊伟">RequestParam2(参数name)</a><br>
    <a href="${pageContext.request.contextPath}/anno/testRequestParam?name=朱俊伟&password=123">RequestParam3(参数name,password)</a><br>
    <hr>
    <form action="${pageContext.request.contextPath}/anno/testRequestBody" method="post">
        用户名：<input type="text" name="username"><br>
        年龄：<input type="number" name="age"><br>
        <input type="submit" value="提交">
    </form><br>

    <a href="${pageContext.request.contextPath}/anno/testPathVariable/10">testPathVariable</a><br>

    <a href="${pageContext.request.contextPath}/anno/testRequestHeader">testRequestHeader</a><br>

    <a href="${pageContext.request.contextPath}/anno/testCookieValue">testCookieValue</a><br>

    <form action="${pageContext.request.contextPath}/anno/testModelAttribute" method="post">
        用户名：<input type="text" name="uname"><br>
        年龄：<input type="number" name="age"><br>
        <input type="submit" value="提交">
    </form><br>

</body>
</html>
