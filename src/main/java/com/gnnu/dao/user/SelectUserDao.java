package com.gnnu.dao.user;

import com.gnnu.entity.user.User;


public interface SelectUserDao {
    // 检测用户密码是否正确（需要用户名、密码） 返回uid
    public int SelectUserByPassword(User user);
}
