package com.gnnu.dao.user.impl;

import com.gnnu.dao.user.InsertUserDao;
import com.gnnu.entity.user.User;
import com.gnnu.utils.DBUtil;

public class InsertUserDaoImpl implements InsertUserDao {
    DBUtil dbUtil=new DBUtil();

    public boolean insertUser(User user) {
        String sql="insert into user(uname,upassword,uwork) values(?,?,'user')";
        int n = dbUtil.update(sql, user.getUname(), user.getUpassword());
        return n==1?true:false;
    }
}
