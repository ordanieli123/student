package com.orcodes.studentsystem.controller;

import com.orcodes.studentsystem.model.Student;
import com.orcodes.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";

    }
    @GetMapping("/getAll")
    public List<Student> get(){
        return  studentService.getAllStudents();

    }

}
