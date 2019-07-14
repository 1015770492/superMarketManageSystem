package com.gnnu.service.user.impl;

import com.gnnu.dao.user.InsertUserDao;
import com.gnnu.dao.user.impl.InsertUserDaoImpl;
import com.gnnu.entity.user.User;
import com.gnnu.service.user.InsertUserService;

public class InsertUserServiceImpl implements InsertUserService {


    @Override
    public boolean save(User user) {
        InsertUserDao insertUserDao=new InsertUserDaoImpl();
        boolean isok = insertUserDao.save(user);
        return isok;
    }
}
