package com.caoyi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caoyi.common.utils.PageUtils;
import com.caoyi.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 16:06:29
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

