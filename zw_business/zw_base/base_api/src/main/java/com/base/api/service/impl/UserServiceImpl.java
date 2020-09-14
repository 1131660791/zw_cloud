package com.base.api.service.impl;

import com.base.api.service.UserService;
import com.base.feign.user.UserFeign;
import org.springframework.stereotype.Service;

/**
 * 用户服务层
 */
@Service("userService")
public class UserServiceImpl implements UserFeign, UserService {

    @Override
    public String getUser() {
        return "用户";
    }

}
