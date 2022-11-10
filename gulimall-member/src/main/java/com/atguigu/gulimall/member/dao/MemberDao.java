package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangwei
 * @email 17625908944@163.com
 * @date 2022-11-08 00:37:53
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
