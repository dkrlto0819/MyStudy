package com.example.myfirstproject.service;

import com.example.myfirstproject.model.Student;
import com.example.myfirstproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create(Student student) {
        studentRepository.save(student);
    }

    public List<Student> list() {
        List<Student> result = (List<Student>) studentRepository.findAll();
        System.out.println(result.get(0));
//        System.out.println(result.get(0).getId());
        return result;
    }
}
