package com.caoyi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caoyi.common.utils.PageUtils;
import com.caoyi.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 20:56:45
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

