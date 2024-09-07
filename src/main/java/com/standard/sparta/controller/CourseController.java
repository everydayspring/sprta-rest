package com.standard.sparta.controller;

import com.standard.sparta.dto.ApiResponse;
import com.standard.sparta.dto.course.CourseCreateRequestDto;
import com.standard.sparta.dto.course.CourseCreateResponseDto;
import com.standard.sparta.dto.course.CourseListResponseDto;
import com.standard.sparta.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    /**
     * 수업(course) 생성
     */
    @PostMapping
    public ApiResponse<CourseCreateResponseDto> createCourseAPI(@RequestBody CourseCreateRequestDto request) {
        CourseCreateResponseDto courseCreateResponseDto = courseService.createCourse(request);
        return ApiResponse.success(
                HttpStatus.CREATED.getReasonPhrase(),
                HttpStatus.CREATED.value(),
                courseCreateResponseDto
        );
    }

    /**
     * 수업(course) 목록 조회
     */
    @GetMapping
    public ApiResponse<CourseListResponseDto> courseListAPI() {

        CourseListResponseDto courseList = courseService.getCourseList();

        return ApiResponse.success(
                HttpStatus.CREATED.getReasonPhrase(),
                HttpStatus.CREATED.value(),
                courseList
        );
    }
}
