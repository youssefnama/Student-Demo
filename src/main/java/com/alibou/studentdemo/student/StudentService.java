package com.alibou.studentdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student("Youssef","Nama", LocalDate.now(),"youssef@",26),
                new Student("Youssef","Nama", LocalDate.now(),"youssef@",26)
        );
    }
}
