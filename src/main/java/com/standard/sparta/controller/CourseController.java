package com.standard.sparta.controller;

import com.standard.sparta.dto.course.CourseCreateRequestDto;
import com.standard.sparta.dto.course.CourseCreateResponseDto;
import com.standard.sparta.dto.course.CourseListResponseDto;
import com.standard.sparta.service.CourseService;
import lombok.RequiredArgsConstructor;
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
    public CourseCreateResponseDto createCourseAPI(@RequestBody CourseCreateRequestDto request) {
        return courseService.createCourse(request);
    }

    /**
     * 수업(course) 목록 조회
     */
    @GetMapping
    public CourseListResponseDto courseListAPI() {
        return courseService.getCourseList();
    }
}
