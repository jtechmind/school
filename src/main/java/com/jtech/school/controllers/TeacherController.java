package com.jtech.school.controllers;

import com.jtech.school.models.Teacher;
import com.jtech.school.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/")
    public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher){
        Teacher newTeacher = teacherService.saveTeacher(teacher);
        return new ResponseEntity<>(newTeacher, HttpStatus.CREATED);
    }
}
