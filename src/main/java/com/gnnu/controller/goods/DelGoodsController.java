package com.gnnu.controller.goods;

import com.gnnu.service.goods.GoodsService;
import com.gnnu.service.goods.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class DelTeacherController
 */
@WebServlet("/del.do")
public class DelGoodsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private GoodsService goodsService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DelGoodsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gid=request.getParameter("gid");
		goodsService=new GoodsServiceImpl();
		boolean isok=goodsService.delete(gid);
		String msg="";
		String url="";
		//根据结果提示用户
		if(isok) {
			//设置成功消息
			msg="删除商品成功！";
			//设置跳转的地址
			url="all.do";
			//把信息保存到request
			request.setAttribute("msg", msg);
			request.setAttribute("url", url);
			//跳转页面
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			msg="删除商品失败！";
			request.setAttribute("msg", msg);
			//跳转页面
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}

	}


}
