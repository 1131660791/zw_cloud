package com.pojo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.bean.Product;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hzw
 * @since 2019-10-24
 */
public interface ProductService extends IService<Product> {

    /*  mybatis Plush 分页 */
    IPage<Product> findProduct(Page page);
}
