<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body style="background:url(images/6.PNG);background-size:100% auto">
<%
	request.setCharacterEncoding("utf-8");
	%>
	<div style="margin-left:200px ;margin-top:100px">
	<form action="add.do" method="post">
		<p style="color:#000000 ;font-family:楷体;"><b style="font-size:20px">商品名称:</b>
		<input type="text" size="10" name="gname" style="color:blue ;font-size:20px"/></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品数量:</b>
		<input type="text" size="10" name="gnum" style="color:blue ;font-size:20px"/></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品价格:</b>
		<input type="text" size="10" name="gprice" style="color:blue ;font-size:20px" /></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品详情:</b>
		<textArea cols="20" rows="3" name="ginfo" style="color:blue ;font-size:20px"></textArea></p>
		<input type="submit" style="color:blue ;font-size:20px;margin-left:280px" value="提交">
	</form>
	</div>
</body>
</html>