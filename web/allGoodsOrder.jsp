
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.gnnu.entity.goods.GoodsOrder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>订单详情</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.css" rel="stylesheet">
</head>
<body style="background:url(images/2.PNG);background-size:100% auto ">
<div class="container">
<table width="70%" class="table table-hover">
<p style="margin-left:80px ;margin-top:100px;color:#aa00dd ;font-family:宋体;font-size:40px">所有订单</p>
<tr ><th width="10%">编号</th><th>用户名</th>
<th>商品名</th><th>商品详情</th><th>售价</th><th>购买数量</th>
<th>付款额</th><th>付款日期</th>

<th width="10%"></th><th width="10%"></th></tr>
<%	
	request.setCharacterEncoding("utf-8");
	List<GoodsOrder> list=(List)request.getAttribute("list");
	for(GoodsOrder goodsOrder:list){
%>
		<tr>
		<td>
		<%=goodsOrder.getGid() %>
		</td>
		<td>
		<%=goodsOrder.getUname() %>
		</td>
		<td>
		<%=goodsOrder.getGname() %>
		</td>
		<td>
		<%=goodsOrder.getGinfo() %>
		</td>
		<td>
		<%=goodsOrder.getGprice() %>
		</td>
		<td>
		<%=goodsOrder.getOnum() %>
		</td>
		<td>
		<%=goodsOrder.getOprice() %>
		</td>
		<td>
		<%=goodsOrder.getOdate() %>
		</td>
		</tr>
		<%
	}
%>
		</table>
	</div>
</body>
</html>