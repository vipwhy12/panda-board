package com.board.panda.controller;

import com.board.panda.model.Member;
import com.board.panda.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MemberRestController {
    private final MemberService memberService;

    //회원가입
    @PostMapping(value = "/join")
    public ResponseEntity<Member> findMember(@Nullable Member body, HttpSession session){
        System.out.println(body);
        Member member = new Member();
        log.info("success");
        return ResponseEntity.status(HttpStatus.CREATED).body(member);
    }

//    @PostMapping("/join")
//    public String join(HttpServletResponse response, Member member) {
//        System.out.println(member);
//
//        boolean isSuccessful = memberService.insertMember(member);
//
//        if (isSuccessful) {
//            log.info("success");
//            return "redirect:/login";
//        } else {
//            log.error("error");
//            return "error";
//        }
//    }
}
