package com.caoyi.gulimall.product.dao;

import com.caoyi.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 16:06:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
