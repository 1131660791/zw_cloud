package com.base.api.controller;

import com.base.api.service.SysUserService;
import com.base.api.service.UserService;
import com.base.common.json.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userClient")
public class UserController  {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/test")
    public String test() {
        JsonUtil.testCommon();
        return "";
    }

    @RequestMapping(value = "/user/getUser")
    public String getUser() {
        return userService.getUser();
    }
}
