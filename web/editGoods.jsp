<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑商品信息</title>
</head>
<body style="background:url(images/5.PNG);background-size:100% auto">
	<%
		request.setCharacterEncoding("utf-8");
		String gid=request.getParameter("gid");
		String gname=request.getParameter("gname");
		String gnum=request.getParameter("gnum");
		String gprice=request.getParameter("gprice");
		String ginfo=request.getParameter("ginfo");
		%>
	<div style="margin-top:100px"></div>
	<form action="edit.do" method="post" style="margin-left:100px">
		<p style="color:#000000 ;font-family:楷体;"><b style="font-size:20px">商品编号:</b>
		<input type="text" size="10px" name="gid" value="<%=gid%>" onfocus="this.blur()"/></p>
		<p style="color:#000000 ;font-family:楷体;"><b style="font-size:20px">商品名称:</b>
		<input type="text" size="13px" name="gname" value="<%=gname%>"/></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品数量:</b>
		<input type="text" size="8px" name="gnum" value="<%=gnum %>"/></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品价格:</b>
		<input type="text" size="8px" name="gprice" value="<%=gprice %>"/></p>
		<p style="color:#000000 ;font-family:楷体"><b style="font-size:20px">商品详情:</b>
		<textArea cols="20" rows="3" name="ginfo" id="ChineseSet">
		<%=ginfo%>
		</textArea><br>
		<b><input type="submit" value="提交" style="margin-left:200px ;color:blue;font-size:20px"></b>
	</form>
</body>
</html>