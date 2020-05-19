package com.consumer.api.controller;

import com.base.feign.user.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消费者 - 控制层
 */
@RestController
@RequestMapping("/consumerController")
public class ConsumerController {

    @Autowired
    private UserFeign userFeign;


    /**
     * 使用feign 调用
     * @return
     */
    @RequestMapping(value = "/getUser")
    public String oa() {
        String user = userFeign.getUser();
        return user;
    }
}