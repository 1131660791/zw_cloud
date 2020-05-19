package com.zw.provider.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zw.provider.bean.Product;
import com.zw.provider.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author hzw
 * @since 2019-10-24
 */
@Slf4j
@RestController
@RefreshScope
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private RestTemplate restTemplate;

    /**
     * 分页查询
     *
     * @return
     */
    @RequestMapping(value = "findAllProduct")
    public IPage<Product> findAllProduct() {
        Product p = productService.getById(1L);
        Page page = new Page();
        page.setCurrent(1L);
        page.setSize(2L);
        IPage<Product> product = productService.findProduct(page);
        return product;
    }

    @RequestMapping(value = "testExpro")
    public void testExpro() throws Exception {
        try{
            throw new Exception();
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }

    @RequestMapping(value = "pushTemplate")
    public void pushTemplate(){

    }
}