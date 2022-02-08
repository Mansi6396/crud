package com.example.crud1.service;

import com.example.crud1.model.Student;
import com.example.crud1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "delete..";
    }

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setEmailid(student.getEmailid());
        return repository.save(existingStudent);
    }

}
