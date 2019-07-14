<%--
  Created by IntelliJ IDEA.
  User: angel
  Date: 2019/7/13
  Time: 下午8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
        <title>登录页面</title>
    <link href="./css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="./css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: url(./img/background.jpg) no-repeat;
            background-size: cover;
            font-size: 16px;
        }
        .form {
            background: rgba(255, 255, 255, 0.4);
            padding: 20px;
            padding-left: 40px;
            padding-right: 40px;
            border-radius:10px;
        }
    </style>
</head>
<body>
<div class="container" style="margin-top: 200px;">
    <form class="col-sm-offset-4 col-sm-4 col-sm-offset-4 form " action="login.do" method="post"
          id="login_form" >
        <div><h3 class="text-center" style="margin-top: 10px">用户登录</h3></div>
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">账&nbsp;号</label>
            <div class="col-sm-10">           
                <input type="text" class="form-control"  id="username" name="username" placeholder="请输入用户名">     
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">密&nbsp;码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
            </div>
        </div>
        <div  style="margin-top: -5px">
        <button type="submit" class="btn btn-success center-block" style="margin-top: 10px" >登录</button>
        </div>

        <div class="row">
            <div class="col-xs-6 col-xs-6 "><a class="text-left" href="forgetpassword.jsp">忘记密码?</a></div>
            <div class="col-xs-6 col-xs-6 "><a class="text-right" href="register.jsp">注册新账号</a> </div>
        </div>


    </form>
</div>

</body>
</html>