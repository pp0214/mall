package com.mall.product.dao;

import com.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tyy
 * @email tyytingyu@gmail.com
 * @date 2020-08-08 15:44:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
