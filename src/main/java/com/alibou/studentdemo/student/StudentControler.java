package com.alibou.studentdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentControler {

    @GetMapping
    public List<String> findAllStudents(){
        return List.of(
                "Youssef",
                "Nama"
        );
    }
}
