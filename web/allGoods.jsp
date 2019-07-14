<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@ page import="com.gnnu.entity.Goods" %>
<!DOCTYPE html>
<html>
<head>
<title>所有商品</title>
<link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.1/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
<div class="jumbotron" style="background:url(images/commerce.PNG) ;background-size:100% auto">
  <h1>上架商品</h1>
  <p><a href="https://www.taobao.com/" class="btn btn-primary btn-lg" role="button">了解更多商品</a></p>
</div>
<a href="addGoods.jsp" class="btn btn-default" style="color:#aa00dd ;font-family:宋体;font-size:20px"><b>新增商品</b></a>
<table width="90%" class="table table-hover">
<tr ><th width="6%">编号</th><th width="15%">名称</th><th width="7%">剩余量</th>
<th width="7%">售价</th><th>商品详情</th>
<th width="10%"></th><th width="10%"></th></tr>
<%
	request.setCharacterEncoding("utf-8");
	List<Goods> list=(List)request.getAttribute("list");
	for(Goods goods:list){
%>
		<tr>
		<td>
		<%=goods.getGid() %>
		</td>
		<td>
		<%=goods.getGname() %>
		</td>
		<td>
		<%=goods.getGnum() %>
		</td>
		<td>
		<%=goods.getGprice() %>
		</td>
		<td>
		<%=goods.getGinfo() %>
		</td>
		<td><a href="editGoods.jsp?gid=<%=goods.getGid()%>
		&&gname=<%=goods.getGname()%>
		&&gnum=<%=goods.getGnum()%>
		&&gprice=<%=goods.getGprice()%>
		&&ginfo=<%=goods.getGinfo()%>" class="btn btn-warning">编辑</a></td>
		<td><a href="del.do?gid=<%=goods.getGid() %>" class="btn btn-danger">删除</a></td>
		</tr>
		<%
	}
%>
		</table>
	</div>
</body>
</html>