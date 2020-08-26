package com.base.api.controller;

import com.base.common.json.JsonUtil;
import com.base.feign.user.UserFeign;
import com.util.response.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userClient")
public class UserController implements UserFeign {

    @RequestMapping(value = "/user/test")
    public String test() {
        JsonUtil.testCommon();
        return "";
    }

    @Override
    public String getUser() {
        return "用户";
    }
}
