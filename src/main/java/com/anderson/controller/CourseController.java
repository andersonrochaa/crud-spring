package com.anderson.controller;

import java.util.List;

import com.anderson.model.Course;
import com.anderson.repository.CourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
//@AllArgsConstructor -> Loombok adiciona inicia geral no construtor.
public class CourseController {
    
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @GetMapping
    public List<Course> list(){
        return courseRepository.findAll();
    }

    @PostMapping
    public void add(Course c){
        courseRepository.save(c);
    }
}
