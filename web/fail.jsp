<%--
  Created by IntelliJ IDEA.
  User: angel
  Date: 2019/7/13
  Time: 下午9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
<%
    String msg=(String)request.getAttribute("msg");
%>
<script type="text/javascript">
    alert("<%=msg%>")
    window.history.back();
</script>
</body>
</html>
