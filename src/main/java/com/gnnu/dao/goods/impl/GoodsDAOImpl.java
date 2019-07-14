package com.gnnu.dao.goods.impl;

import com.gnnu.dao.goods.GoodsDAO;
import com.gnnu.entity.goods.Goods;
import com.gnnu.entity.goods.GoodsOrder;
import com.gnnu.utils.DBUtil;

import javax.sql.rowset.CachedRowSet;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GoodsDAOImpl implements GoodsDAO {

	private DBUtil dbUtil;
	@Override
	public int save(Goods goods) {

		String sql="insert into goods(gname,gnum,gprice,ginfo) values(?,?,?,?)";
		dbUtil=new DBUtil();
		int i=dbUtil.update(sql, goods.getGname(),goods.getGnum(),goods.getGprice(),goods.getGinfo());
		return i;
	}

	@Override
	public List<Goods> findAll() {
		List<Goods> list=new ArrayList();
		String sql="select * from goods";
		dbUtil=new DBUtil();
		CachedRowSet cachedRowSet = dbUtil.query(sql);
		try {
			while(cachedRowSet.next()) {
				int gid=cachedRowSet.getInt("gid");
				String gname=cachedRowSet.getString("gname");
				int gnum=cachedRowSet.getInt("gnum");
				BigDecimal gprice=cachedRowSet.getBigDecimal("gprice");
				String ginfo=cachedRowSet.getString("ginfo");
				Goods goods=new Goods(gid,gname,gnum,gprice,ginfo);
				list.add(goods);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(cachedRowSet!=null) {
				try {
					cachedRowSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	@Override
	public int delete(String gid) {
		String sql="delete from goods where gid=?";
		dbUtil=new DBUtil();
		int i = dbUtil.update(sql,gid);
		return i;
	}

	//商品订单
	@Override
	public List<GoodsOrder> findAllOrder() {
		List<GoodsOrder> list=new ArrayList();
		String sql="select * from orderGoods";
		dbUtil=new DBUtil();
		CachedRowSet cachedRowSet = dbUtil.query(sql);
		try {
			while(cachedRowSet.next()) {
				int oid=cachedRowSet.getInt("oid");
				int gid=cachedRowSet.getInt("gid");
				int uid=cachedRowSet.getInt("uid");
				String uname=cachedRowSet.getString("uname");
				String gname=cachedRowSet.getString("gname");
				String ginfo=cachedRowSet.getString("ginfo");
				String gprice=cachedRowSet.getString("gprice");
				int onum=cachedRowSet.getInt("onum");
				String oprice=cachedRowSet.getString("oprice");
				String odate=cachedRowSet.getString("odate");

				GoodsOrder goodsOrder=new GoodsOrder(oid,gid,uid,uname,gname,ginfo
						,gprice,onum,oprice,odate);
				list.add(goodsOrder);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(cachedRowSet!=null) {
				try {
					cachedRowSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public int edit(String gid,String gname,String gnum,String gprice,String ginfo) {
		// TODO Auto-generated method stub
		String sql="update goods set gname=?,gnum=?,gprice=?,ginfo=? where gid=?";
		dbUtil=new DBUtil();
		int i = dbUtil.update(sql,gname,gnum,gprice,ginfo,gid);
		return i;
	}
}
