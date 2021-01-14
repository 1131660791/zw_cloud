package com.base.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @RequestMapping("/login")
    public String login() {
        return "登录成功";
    }

}
