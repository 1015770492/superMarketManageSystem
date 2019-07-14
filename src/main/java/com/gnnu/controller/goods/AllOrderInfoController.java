package com.gnnu.controller.goods;



import com.gnnu.entity.goods.GoodsOrder;
import com.gnnu.service.goods.GoodsService;
import com.gnnu.service.goods.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/allOrder.do")
public class AllOrderInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private GoodsService goodsService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllOrderInfoController() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		// TODO Auto-generated method stub
		goodsService=new GoodsServiceImpl();
		List<GoodsOrder> list = goodsService.findAllOrder();
		request.setAttribute("list", list);
		request.getRequestDispatcher("allGoodsOrder.jsp").forward(request, response);	
	}
}

