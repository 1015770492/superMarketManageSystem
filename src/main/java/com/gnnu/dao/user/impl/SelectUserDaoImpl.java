package com.gnnu.dao.user.impl;


import com.gnnu.dao.user.SelectUserDao;
import com.gnnu.entity.user.User;
import com.gnnu.utils.DBUtil;

import javax.sql.rowset.CachedRowSet;

public class SelectUserDaoImpl implements SelectUserDao {

    CachedRowSet cachedRowSet=null;
    private DBUtil dbUtil=new DBUtil();

    @Override
    public CachedRowSet checkUserPassword(User user) {
        String sql="SELECT uid FROM users where uname=? and upassword=?";
        cachedRowSet = dbUtil.query(sql,user.getUname(),user.getUpassword());
        return cachedRowSet;
    }
}
