package com.gnnu.service.goods.impl;




import com.gnnu.dao.goods.GoodsDAO;
import com.gnnu.dao.goods.impl.GoodsDAOImpl;
import com.gnnu.entity.goods.Goods;
import com.gnnu.entity.goods.GoodsOrder;
import com.gnnu.service.goods.GoodsService;

import java.util.List;


public class GoodsServiceImpl implements GoodsService {

    private GoodsDAO goodsDAO;

    @Override
    public boolean save(Goods goods) {
        goodsDAO=new GoodsDAOImpl();	//多态
        int i=goodsDAO.save(goods);
        return i==1?true:false;
    }

    @Override
    public List<Goods> findAll() {
        goodsDAO=new GoodsDAOImpl();	//多态
        return goodsDAO.findAll();
    }

    @Override
    public boolean delete(String gid) {
        goodsDAO=new GoodsDAOImpl();	//多态
        int i=goodsDAO.delete(gid);
        return i==1?true:false;
    }

    @Override
    public List<GoodsOrder> findAllOrder() {
        goodsDAO=new GoodsDAOImpl();	//多态
        return goodsDAO.findAllOrder();
    }

    @Override
    public boolean edit(String gid,String gname,String gnum,String gprice,String ginfo) {
        goodsDAO=new GoodsDAOImpl();	//多态
        int i=goodsDAO.edit(gid,gname,gnum,gprice,ginfo);
        return i==1?true:false;
    }


}
