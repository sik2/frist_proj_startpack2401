package com.start.first.domain.member.controller;

import com.start.first.domain.email.service.EmailService;
import com.start.first.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;
    private final EmailService emailService;
    @GetMapping("/login")
    public String loginPage() {
        return "member/login";
    }

    @GetMapping("/join")
    public String joinPage() {
        return "member/join";
    }

    @PostMapping("/join")
    public String join () {
        //
        //

        emailService.send("test@test.com", "가입을 환영합니다.", "환영합니다.");

        return "";
    }

}
