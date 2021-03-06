package com.example.myfirstproject.controller;

import com.example.myfirstproject.model.Student;
import com.example.myfirstproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // contoller + response body
@RequestMapping("/students") // 기본 route 걸기
public class StudentController {
    @Autowired // service를 연결해준다
    private StudentService studentService;

    @PostMapping // http method : post
    public void create(@RequestBody Student student) { // request body의 student를 인식해라!
        studentService.create(student);
    }

    @GetMapping
    public List<Student> list(){
        return studentService.list();
    }
}
