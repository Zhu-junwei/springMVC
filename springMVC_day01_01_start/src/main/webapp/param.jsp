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
    <title>param</title>
</head>
<body>
    <h3>请求参数绑定</h3>
    <a href="${pageContext.request.contextPath}/param/testParam?username=朱俊伟&password=123">请求参数绑定</a><br/>

    <%--封装到Account对象中--%>
    <h3>封装到Account对象中</h3>
    <form method="post" action="${pageContext.request.contextPath}/param/saveAccount">
        姓名：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/><br>
        金额：<input type="number" name="money"/><br>
        用户名：<input type="text" name="user.uname"/><br>
        年龄：<input type="number" name="user.age"/><br>
        <input type="submit" value="提交"/><br>
    </form><br>

    <%--封装到Account对象中,包含集合--%>
    <h3>封装到Account对象中，包含集合</h3>
    <form method="post" action="${pageContext.request.contextPath}/param/saveAccount">
        姓名：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/><br>
        金额：<input type="number" name="money"/><br>

        用户名1：<input type="text" name="list[0].uname"/><br>
        年龄1：<input type="number" name="list[0].age"/><br>
        用户名2：<input type="text" name="list[1].uname"/><br>
        年龄2：<input type="number" name="list[1].age"/><br>
        用户名3：<input type="text" name="map['one'].uname"/><br>
        年龄3：<input type="number" name="map['one'].age"/><br>
        用户名4：<input type="text" name="map['two'].uname"/><br>
        年龄4：<input type="number" name="map['two'].age"/><br>
        <input type="submit" value="提交"/><br>
    </form><br>

    <h3>封装到User对象中，包含日期类型</h3>
    <form method="post" action="${pageContext.request.contextPath}/param/saveUser">
        姓名：<input type="text" name="uname"/><br>
        年龄：<input type="number" name="age"/><br>
        生日：<input type="text" name="date"><br>
        <input type="submit" value="提交"/><br>
    </form><br>

    <a href="${pageContext.request.contextPath}/param/testServlet?username=朱俊伟&password=123">Servlet原生的API</a><br/>


</body>
</html>
