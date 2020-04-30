package com.base.api.controller;

import com.base.common.json.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${setting.api.prefix}")
public class BaseController {

    @RequestMapping(value = "/user/test")
    public String test(){
        JsonUtil.testCommon();
        return "";
    }

}
