package com.consumer.api.service.impl;

import com.consumer.api.pojo.Consumer;
import com.consumer.api.mapper.ConsumerMapper;
import com.consumer.api.service.ConsumerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hzw
 * @since 2020-05-20
 */
@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumerMapper, Consumer> implements ConsumerService {

}
