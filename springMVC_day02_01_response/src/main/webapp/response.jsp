<%--
  Created by IntelliJ IDEA.
  User: zjw
  Date: 20/06/15
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response</title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function () {
                // alert("hello");
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"土豆是个大傻子","password":"123456","age":20}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <a href="/user/testString">testString</a><br>
    <a href="/user/testVoid">testVoid</a><br>
    <a href="/user/testModelAndView">testModelAndView</a><br>
    <a href="/user/testForwardOrRedirect">testForwardOrRedirect</a><br>
    <a href="/user/testJson1">testJson1 返回对象</a><br>
    <a href="/user/testJson2">testJson2 返回String</a><br>

    <button id="btn">发送ajax请求</button>
</body>
</html>
