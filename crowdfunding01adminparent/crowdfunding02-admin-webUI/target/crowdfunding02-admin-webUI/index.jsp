<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <script type="text/javascript" src="jQuery/jquery.min.js"></script>
    <script type="text/javascript" src="layer/layer.js"></script>
    <!--  -->
    <base href="http://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">

    <script type="text/javascript">
        $(function(){
            $("#btn1").click(function () {
                $.ajax({
                    "url": "send/array1.html",           // 请求资源地址
                    "type": "post",                     // 请求方式
                    "data": {
                        "array":[2, 42, 4]
                    },                                  // 发送的请求参数
                    "dataType": "text",                 // 对待服务器返回的数据
                    "success": function (response) {    // 服务器成功处理请求后的回调函数，response是响应体数据
                        alert(response);
                    },
                    "error":function (response) {       // 服务器失败处理请求后的回调函数
                        alert(response);
                    }
                });
            });

            $("#btn2").click(function () {

                //准备好要发送到服务器端的数组
                var array = [5, 8, 12];

                console.log(array.length);

                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(array);

                console.log(requestBody.length);

                $.ajax({
                    "url": "send/array2.html",          // 请求资源地址
                    "type": "post",                     // 请求方式
                    "data": requestBody,                // 请求体
                    "contentType": 'application/json;charset=utf-8',//设置请求体的内容类型，告诉服务器端本次请求的请求体是JSON数据
                    "dataType": "text",                 // 对待服务器返回的数据
                    "success": function (response) {    // 服务器成功处理请求后的回调函数，response是响应体数据
                        alert(response);
                    },
                    "error":function (response) {       // 服务器失败处理请求后的回调函数
                        alert(response);
                    }
                });
            });

            $("#btn4").click(function () {
                //准备好要发送到服务器端的数据
                var student = {
                    "stuID": 5,
                    "stuName": "tom",
                    "address": {
                        "province":"广东",
                        "city":"深圳",
                        "street":"后瑞"
                    },
                    "subjectList": [
                        {
                            "subjectName": "JavaSE",
                            "subjectScore": 100
                        }, {
                            "subjectName": "SSM",
                            "subjectScore": 99
                        }
                    ],
                    "map": {
                        "k1": "v1",
                        "k2": "v2"
                    }
                };
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(student);
                $.ajax({
                    "url": "send/compose/object2.json",
                    "type": "post",
                    "contentType": "application/json;charset=utf-8",
                    "dataType": "json",
                    "data": requestBody,
                    "success": function (response) {    // 服务器成功处理请求后的回调函数，response是响应体数据
                        console.log(response);
                    },
                    "error":function (response) {       // 服务器失败处理请求后的回调函数
                        console.log(response);
                    }
                });
            });

            $("#btn3").click(function () {
                //准备好要发送到服务器端的数据
                var student = {
                    "stuID": 5,
                    "stuName": "tom",
                    "address": {
                        "province":"广东",
                        "city":"深圳",
                        "street":"后瑞"
                    },
                    "subjectList": [
                        {
                            "subjectName": "JavaSE",
                            "subjectScore": 100
                        }, {
                            "subjectName": "SSM",
                            "subjectScore": 99
                        }
                    ],
                    "map": {
                        "k1": "v1",
                        "k2": "v2"
                    }
                };
                //将JSON数组转换为JSON字符串
                var requestBody = JSON.stringify(student);
                $.ajax({
                    "url": "send/compose/object.html",
                    "type": "post",
                    "contentType": "application/json;charset=utf-8",
                    "dataType": "text",
                    "data": requestBody,
                    "success": function (response) {    // 服务器成功处理请求后的回调函数，response是响应体数据
                        alert(response);
                    },
                    "error":function (response) {       // 服务器失败处理请求后的回调函数
                        alert(response);
                    }
                });
            });

            $(#byn5).click(function () {
                layer.msg("layer 的弹框")

            });


        });

    </script>

</head>
<body>
    <h2>Hello World!</h2>

    <!--
    <a href="test/ssm.html">测试ssm整合环境</a>

    <br/>

    <button id="btn1">Send [2, 42, 4] One </button>

    <br/>

    <button id="btn2">Send [2, 42, 4] two </button>

    <br/>

    <button id="btn3">Send Compose object </button>

    <br/>

    <button id="btn4">Send Compose object 2</button>

    <br/>

    <button id="btn5">弹框演示</button>
    -->

    <a href="admin/to/login/page.html">login</a>
</body>
</html>
