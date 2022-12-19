package com.board.panda.service;

import com.board.panda.mapper.MemberMapper;
import com.board.panda.model.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

//    public ResponseEntity<Member> selectMember(Member member){
//        log.info("test sineup");
//        Member member
//    }

    //restAPI(회원가입)
//    public ResponseBody<Member> selectMember(Member member, HttpSession session){
//        log.info("select member");
//        Member memberInfo = memberMapper.selectMember(member);
//
//
//    }
}
