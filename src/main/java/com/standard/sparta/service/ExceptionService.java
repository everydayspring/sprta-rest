package com.standard.sparta.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExceptionService {

    public void callCheckedException() throws Exception {
        // 체크예외
        // try 처리하지 않으면 compile error
        throw new Exception();

//        try{
//            throw new Exception();
//        } catch (Exception e) {
//            log.info("예외처리");
//        }

    }

    public void callUncheckedException() {
        // 언체크 예외
        throw new RuntimeException();
    }
}
