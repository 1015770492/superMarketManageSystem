<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.css" rel="stylesheet">
</head>
<body style="background:url(images/8.PNG);background-size:100% auto ">
<%
	request.setCharacterEncoding("utf-8");
	%>
<div class="container" style="margin-left:200px ;margin-top:100px" >
<h1 style="color:#000000 ;font-family:宋体" ><b>商品管理</b></h1><br>
	<form action="all.do" method="get">
		<input type="submit" name="check1" value="查询所有商品信息" style="color:blue ;font-size:20px"/><br>
		<input type="submit" name="check3" value="修改商品信息" style="color:#bbbb00 ;font-size:20px ;margin-top:15px"/><br>
		<input type="submit" name="check4" value="删除商品信息" style="color:blue ;font-size:20px;margin-top:15px"/><br>
	</form>
	<form action="addGoods.jsp" method="post">
		<input type="submit" name="check2" value="添加出售商品" style="color:#bbbb00 ; font-size:20px;margin-top:15px"/><br>
	</form>
	<form action="allOrder.do" method="post">
		<input type="submit" name="check5" value="查询所有订单信息" style="color:blue ; font-size:20px;margin-top:15px"/><br>
	</form>
	<div></div>
</div>
</body>
</html>