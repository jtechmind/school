package com.jtech.school.controllers;

import com.jtech.school.models.Course;
import com.jtech.school.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
@CrossOrigin(origins = "http://localhost:3000/")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/")
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        Course savedCourse = courseService.saveCourse(course);
        return new ResponseEntity<>(savedCourse,HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Course>> getAllCourses(){
       List<Course> courses = courseService.getAllCourses();
       return new ResponseEntity<>(courses,HttpStatus.OK);
    }

    public ResponseEntity<Course> getOneCourseById(@RequestBody String id){
        Course course = courseService.getCourseById(id);
        return new ResponseEntity<>(course,HttpStatus.OK);
    }
}
