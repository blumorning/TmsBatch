package com.dmp.tms.tmsbatch.member;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVo> selectMembers();
}
