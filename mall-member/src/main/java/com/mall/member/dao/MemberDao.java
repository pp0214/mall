package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author tyy
 * @email tyytingyu@gmail.com
 * @date 2020-08-08 16:25:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
