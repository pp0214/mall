package com.mall.coupon.dao;

import com.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author tyy
 * @email tyytingyu@gmail.com
 * @date 2020-08-08 16:19:42
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
