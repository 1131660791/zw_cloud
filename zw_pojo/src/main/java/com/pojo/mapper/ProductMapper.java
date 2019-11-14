package com.pojo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pojo.bean.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hzw
 * @since 2019-10-24
 */
@Repository("productMapper")
public interface ProductMapper extends BaseMapper<Product> {

    IPage<Product> findProductPage(Page page, Product product);
}
