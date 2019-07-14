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
import java.util.List;

@WebServlet("/all.do")
public class AllGoodsController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private GoodsService goodsService;

    public AllGoodsController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        goodsService=new GoodsServiceImpl();
        List<Goods> list = goodsService.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("allGoods.jsp").forward(request, response);
    }


}
