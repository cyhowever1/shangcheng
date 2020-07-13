package com.caoyi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caoyi.common.utils.PageUtils;
import com.caoyi.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 16:06:28
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

