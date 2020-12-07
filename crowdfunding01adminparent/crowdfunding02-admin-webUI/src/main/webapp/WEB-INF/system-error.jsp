<%--
  Created by IntelliJ IDEA.
  User: YANG
  Date: 2020/10/14
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="jQuery/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                //相当于后退
                window.history.back();
            });
        });
    </script>
</head>
<body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <div><a class="navbar-brand" href="index.html" style="font-size:32px;">创意产品众筹平台</a></div>
            </div>
        </div>
    </nav>

    <h2 class="form-signin-heading" style="text-align: center;">
        <i class="glyphicon glyphicon-log-in"></i> 系统消息
    </h2>

    <!--
        requestScope对应的是存放request域数据的map
        requestScope.exception 对应request.getAttribute("exception");
        requestScope.exception.message 对应 exception.getMessage();
        从请求域取出exception对象，进一步访问message对象取得错误消息
    -->
    <h3 style="text-align: center">${requestScope.exception.message}</h3>

    <button id="btn0" class="btn btn-lg btn-success btn-block" style="width: 150px;margin: auto "> 返回 </button>

</body>
</html>
