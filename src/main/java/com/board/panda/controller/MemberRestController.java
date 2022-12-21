package com.board.panda.controller;

import com.board.panda.model.Member;
import com.board.panda.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequiredArgsConstructor
@Configuration
public class MemberRestController {
    private final MemberService memberService;

    //회원가입
    @PostMapping(value = "/join")
    public ResponseEntity<Member> insertMember(@Nullable @RequestBody Member body, HttpSession session){
        System.out.println(body);
        log.info("entry");
        ResponseEntity<Member> result = memberService.insertMember(body);

        return result;
    }
}
