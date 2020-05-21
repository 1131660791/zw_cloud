package com.zw.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider", path = "/providerFeign",fallbackFactory = void.class)
public class ProviderFeign {

}
