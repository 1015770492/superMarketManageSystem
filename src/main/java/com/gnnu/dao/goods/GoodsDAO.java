package com.gnnu.dao.goods;



import com.gnnu.entity.goods.Goods;
import com.gnnu.entity.goods.GoodsOrder;

import java.util.List;


public interface GoodsDAO {
	
	public int save(Goods goods);
	public List<Goods> findAll();
	public int delete(String gid);
	public List<GoodsOrder> findAllOrder();
	public int edit(String gid, String gname, String gnum, String gprice, String ginfo);
	
}
