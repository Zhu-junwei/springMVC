<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <a href="https://www.baidu.com" target="_blank">百度</a>

    <h3>传统文件上传</h3>

    <form action="${pageContext.request.contextPath}/user/fileUpload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        <%--用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>--%>
        <input type="submit" value="上传" />
    </form><br>

    <form action="${pageContext.request.contextPath}/user/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit" value="上传" />
    </form><br>

    <hr>
    <h3>跨服务器文件上传</h3>
    <form action="${pageContext.request.contextPath}/user/fileUpload3" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" /><br/>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit" value="上传" />
    </form><br>

</body>
</html>
