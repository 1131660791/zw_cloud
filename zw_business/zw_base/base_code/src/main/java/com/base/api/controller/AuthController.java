package com.base.api.controller;

import com.util.jwt.JwtUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @RequestMapping("/login")
    public String login() {
        return "登录成功: " + JwtUtil.createJWT(System.currentTimeMillis(), "123", "userName", "Password");
    }
}