package com.gnnu.service.user.impl;

import com.gnnu.dao.user.SelectUserDao;
import com.gnnu.dao.user.impl.SelectUserDaoImpl;
import com.gnnu.entity.user.User;
import com.gnnu.service.user.CheckUserService;

import javax.sql.rowset.CachedRowSet;
import java.sql.SQLException;

public class CheckUserServiceImpl implements CheckUserService {

    @Override
    public int checkUidByPassword(User user) {
        int uid=-1;
        SelectUserDao selectUserDao=new SelectUserDaoImpl();
        uid = selectUserDao.SelectUserByPassword(user);
        return uid;
    }
}
