package com.sjh.springbasic.service;

import com.sjh.springbasic.dto.PostUserRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
}
