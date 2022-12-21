package com.board.panda.mapper;

import com.board.panda.model.Member;
import com.board.panda.service.MemberService;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    Boolean insertMember(Member member);
}
