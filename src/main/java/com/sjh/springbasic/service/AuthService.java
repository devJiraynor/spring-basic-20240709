package com.sjh.springbasic.service;

import com.sjh.springbasic.dto.PostUserRequestDto;
import com.sjh.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);
    String signIn(SignInRequestDto dto);
}
