package com.gnnu.controller.goods;



import com.gnnu.entity.goods.Goods;
import com.gnnu.service.goods.GoodsService;
import com.gnnu.service.goods.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;


/**
 * Servlet implementation class TeacherController
 */
@WebServlet("/add.do")
public class AddGoodsController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String gname=request.getParameter("gname");
		String num=request.getParameter("gnum");
		int gnum=Integer.parseInt(num);
		String price=request.getParameter("gprice");
		BigDecimal gprice=new BigDecimal(price);
		String ginfo=request.getParameter("ginfo");
		//实例teacher对象
		Goods goods=new Goods(0,gname,gnum,gprice,ginfo);
		//实例Service
		GoodsService goodsService=new GoodsServiceImpl();
		//进行保存
		boolean isok=goodsService.save(goods);
		String msg="";
		String url="";
		//根据结果提示用户
		if(isok) {
			//设置成功消息
			msg="新增商品成功！";
			//设置跳转的地址
			url="all.do";
			//把信息保存到request
			request.setAttribute("msg", msg);
			request.setAttribute("url", url);
			//跳转页面
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else {
			msg="新增商品失败！";
			request.setAttribute("msg", msg);
			//跳转页面
			request.getRequestDispatcher("fail.jsp").forward(request, response);
		}
	}
}


