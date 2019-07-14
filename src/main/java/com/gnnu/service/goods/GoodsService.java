package com.gnnu.service.goods;

import com.gnnu.entity.goods.Goods;
import com.gnnu.entity.goods.GoodsOrder;
import java.util.List;


public interface GoodsService {

	public boolean save(Goods goods);

	public List<Goods> findAll();

	public boolean delete(String gid);
	
	public List<GoodsOrder> findAllOrder();
	
	public boolean edit(String gid, String gname, String gnum, String gprice, String ginfo);

}
