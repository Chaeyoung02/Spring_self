package com.example.server.controller;

import com.example.server.domain.Member;
import com.example.server.repository.MemberRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller //컨트롤러임을 알림
@RequiredArgsConstructor //의존관계를 위해 필요
public class MemberController {
    private final MemberRepository memberRepository;
    @PostMapping("/signup")
    public ResponseEntity<?> singUp(@RequestBody Member member) {
        String username = member.getUsername();
        String password = member.getPassword();
        String email = member.getEmail();

        if (username == null || password == null || email == null) {
            return ResponseEntity.badRequest().body("회원 정보를 모두 입력해주세요.");
        }

        memberRepository.save(member);
        System.out.println(member);
        return ResponseEntity.ok("회원가입 완료");
    }

}
