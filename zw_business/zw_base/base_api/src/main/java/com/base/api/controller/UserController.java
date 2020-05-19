package com.base.api.controller;

import com.base.common.json.JsonUtil;
import com.base.feign.user.UserFeign;
import com.util.model.ResponseModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userClient")
public class UserController implements UserFeign {

    @RequestMapping(value = "/user/test")
    public String test() {
        ResponseModel responseModel = new ResponseModel();
        JsonUtil.testCommon();
        return "";
    }

    @Override
    public String getUser() {
        return "用户";
    }
}
