package com.caoyi.gulimall.member.dao;

import com.caoyi.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cy
 * @email 1640770256@qq.com
 * @date 2020-06-06 20:45:16
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
