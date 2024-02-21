package com.jtech.school.controllers;

import com.jtech.school.models.Student;
import com.jtech.school.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/school")
@CrossOrigin(origins = "http://localhost:3000/")
public class SchoolApplication {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String schoolApplication(){
        return "Welcome To The School Application.";
    }
    @GetMapping("/students")
    public List<Student> students(){
        return studentRepository.findAll();
    }
}
