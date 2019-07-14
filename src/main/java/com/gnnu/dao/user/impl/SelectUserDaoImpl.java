package com.gnnu.dao.user.impl;


import com.gnnu.dao.user.SelectUserDao;
import com.gnnu.entity.user.User;
import com.gnnu.utils.DBUtil;

import javax.sql.rowset.CachedRowSet;
import java.sql.SQLException;

public class SelectUserDaoImpl implements SelectUserDao {

    CachedRowSet cachedRowSet=null;
    private DBUtil dbUtil=new DBUtil();

    @Override
    public int SelectUserByPassword(User user)  {
        String sql="select * from users where uname=? and upassword=?";
        CachedRowSet cachedRowSet = dbUtil.query(sql, user.getUname(), user.getUpassword());
        int uid = 0;
        try {
            uid = cachedRowSet.getInt("uid");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return uid;
    }
}
