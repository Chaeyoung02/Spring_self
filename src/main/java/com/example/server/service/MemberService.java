package com.example.server.service;

import com.example.server.dto.MemberFormDTO;
public interface MemberService {
    Long join(MemberFormDTO memberFormDTO);
}
