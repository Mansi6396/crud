package com.example.crud1.controller;

import com.example.crud1.model.Student;
import com.example.crud1.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController

public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent( id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

}
