package com.gnnu.entity.goods;

public class GoodsOrder {
	private int oid;
	private int gid;
	private int uid;
	private String uname;
	private String gname;
	private String ginfo;
	private String gprice;
	private int onum;
	private String oprice;
	private String odate;
	
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
	public String getGprice() {
		return gprice;
	}
	public void setGprice(String gprice) {
		this.gprice = gprice;
	}
	public String getGinfo() {
		return ginfo;
	}
	public void setGinfo(String ginfo) {
		this.ginfo = ginfo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getOnum() {
		return onum;
	}
	public void setOnum(int onum) {
		this.onum = onum;
	}
	public String getOprice() {
		return oprice;
	}
	public void setOprice(String oprice) {
		this.oprice = oprice;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	
	@Override
	public String toString() {
		return "GoodsOrder [oid=" + oid +",gid=" + gid + ",uid=" + uid + 
				", uname=" + uname + ", gname=" + gname + ",ginfo="+ginfo+","
						+ "gprice="+gprice+",onum="+onum+",oprice="+oprice+",odate="+odate+"]";
	}
	
	public GoodsOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsOrder(int oid,int gid,int uid,String uname,String gname,String ginfo,
		String gprice,int onum,String oprice,String odate) {
		super();
		this.oid = oid;
		this.gid = gid;
		this.uid = uid;
		this.uname =uname;
		this.gname = gname;
		this.ginfo=ginfo;
		this.gprice=gprice;
		this.onum=onum;
		this.oprice=oprice;
		this.odate=odate;
	}
}
