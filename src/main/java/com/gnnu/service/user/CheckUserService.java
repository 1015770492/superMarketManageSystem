package com.gnnu.service.user;

import com.gnnu.entity.user.User;

public interface CheckUserService {

    // 检测账号密码是否正确，返回uid
    int checkUidByPassword(User user);

}
