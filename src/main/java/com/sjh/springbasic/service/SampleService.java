package com.sjh.springbasic.service;

import org.springframework.http.ResponseEntity;

import com.sjh.springbasic.dto.PostSample1RequestDto;

public interface SampleService {
    
    ResponseEntity<String> postSample1 (PostSample1RequestDto dto);

}
