package com.example.server.service.lmpl;

import com.example.server.domain.Member;
import com.example.server.dto.MemberFormDTO;
import com.example.server.repository.MemberRepository;
import com.example.server.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service			// 내가 서비스다
@RequiredArgsConstructor	// 밑에 MemberRepository의 생성자를 쓰지 않기 위해서
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Long join(MemberFormDTO memberFormDTO) {
        Member member = Member.builder()
                .email(memberFormDTO.getEmail())
                .username(memberFormDTO.getUsername())
                .password(memberFormDTO.getPassword())
                .build();

        return memberRepository.save(member).getId();
    }
}
