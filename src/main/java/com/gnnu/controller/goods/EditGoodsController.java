package com.gnnu.controller.goods;



import com.gnnu.service.goods.GoodsService;
import com.gnnu.service.goods.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/edit.do")
public class EditGoodsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private GoodsService goodsService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String gid=request.getParameter("gid");
		String gname=request.getParameter("gname");
		String gnum=request.getParameter("gnum");
		String gprice=request.getParameter("gprice");
		String ginfo=request.getParameter("ginfo");
		goodsService=new GoodsServiceImpl();
		boolean isok=goodsService.edit(gid,gname,gnum,gprice,ginfo);
		String msg="";
		String url="";
		//根据结果提示用户
		if(isok) {
			//设置成功消息
			msg="编辑商品成功！";
			//设置跳转的地址
			url="all.do";
			//把信息保存到request
			request.setAttribute("msg", msg);
			request.setAttribute("url", url);
			//跳转页面
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			msg="编辑商品失败！";
			request.setAttribute("msg", msg);
			//跳转页面
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
	}

}
