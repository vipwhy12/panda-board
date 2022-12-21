package com.board.panda.service;

import com.board.panda.mapper.MemberMapper;
import com.board.panda.model.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.jdbc.Null;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Service
@Slf4j
@RequiredArgsConstructor
public class MemberService {
    private final MemberMapper memberMapper;

    public ResponseEntity<Member> insertMember(Member member) {
        log.info("Insert Member Test");

        System.out.println("==================");
        System.out.println(member);

        boolean memberInfo = memberMapper.insertMember(member);

        System.out.println(memberInfo);

        //ResponseEntity.status(HttpStatus.CREATED).body(member);
        return ResponseEntity.ok().body(member);
    }

}