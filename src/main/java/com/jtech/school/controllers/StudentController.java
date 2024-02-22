package com.jtech.school.controllers;

import com.jtech.school.models.Student;
import com.jtech.school.repositories.StudentRepository;
import com.jtech.school.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student newStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        return students;
    }

}
