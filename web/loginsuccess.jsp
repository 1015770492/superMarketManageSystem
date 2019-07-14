<%--
  Created by IntelliJ IDEA.
  User: angel
  Date: 2019/7/13
  Time: 下午9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面跳转</title>
</head>
<body>
<body>
<%
    String msg = (String) request.getAttribute("msg");
    String url = (String) request.getAttribute("url");
%>
<script type="text/javascript">
    alert("<%=msg%>")
    window.location.href = "<%=url%>";
</script>
</body>
</html>
