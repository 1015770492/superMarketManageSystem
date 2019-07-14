package com.gnnu.dao.user;

import com.gnnu.entity.user.User;

import javax.sql.rowset.CachedRowSet;

public interface SelectUserDao {
    // 检测用户密码是否正确（需要用户名、密码） 返回uid
    CachedRowSet checkUserPassword(User user);
}
