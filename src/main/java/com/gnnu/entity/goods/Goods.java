package com.gnnu.entity.goods;

import java.math.BigDecimal;

public class Goods {
	
	private int gid;
	private String gname;
	private int gnum;
	private BigDecimal gprice;
	private String ginfo;
	
	public int getGid() {
		return gid;
	}
	
	public void setGid(int gid) {
		this.gid = gid;
	}
	
	public String getGname() {
		return gname;
	}
	
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	public String getGinfo() {
		return ginfo;
	}

	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}

	public int getGnum() {
		return gnum;
	}

	public void setGnum(int gnum) {
		this.gnum = gnum;
	}

	public BigDecimal getGprice() {
		return gprice;
	}

	public void setGprice(BigDecimal gprice) {
		this.gprice = gprice;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ",gnum="+gnum+",gprice="+gprice+",ginfo="+ginfo+"]";
	}
	
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(int gid, String gname, int gnum, BigDecimal gprice, String ginfo) {
		this.gid = gid;
		this.gname = gname;
		this.gnum = gnum;
		this.gprice = gprice;
		this.ginfo = ginfo;
	}
}
