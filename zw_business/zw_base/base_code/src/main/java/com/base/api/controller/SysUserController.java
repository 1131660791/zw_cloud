package com.base.api.controller;


import com.consumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author hzw
 * @since 2021-01-15
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ConsumerFeign consumerFeign;

    @RequestMapping(value = "/getConsumer")
    public String testFeign() {
        return consumerFeign.consumerS();
    }

}

