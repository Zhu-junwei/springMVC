<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/07/01
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="/account/findAll">查询所有</a>
    <form action="/account/saveAccount" method="post">
        姓名：<input type="text" name="name" /><br>
        金额：<input type="text" name="money" /><br>
        <input type="submit" value="保存">
    </form>
</body>
</html>
