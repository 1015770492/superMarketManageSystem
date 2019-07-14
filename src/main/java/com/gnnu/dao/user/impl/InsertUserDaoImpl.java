package com.gnnu.dao.user.impl;

import com.gnnu.dao.user.InsertUserDao;
import com.gnnu.entity.user.User;
import com.gnnu.utils.DBUtil;

public class InsertUserDaoImpl implements InsertUserDao {
    DBUtil dbUtil=new DBUtil();

    @Override
    public boolean save(User user) {

        return false;
    }
}
