package com.standard.sparta.excepttion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionEahdler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllExcpetion(Exception e) {
        return new ResponseEntity<>("서버 에러 발생", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DuplicateCourseNameException.class)
    public ResponseEntity<String> handleCourseNameExcpetion(DuplicateCourseNameException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

}
