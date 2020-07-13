package com.caoyi.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.caoyi.common.utils.PageUtils;
import com.caoyi.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 16:06:28
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

