package com.base.feign.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "user",fallbackFactory = Object.class)
public interface UserFeign {

    @RequestMapping(value = "")
    void getUser();

}