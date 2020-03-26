package com.itlebron.controller;

import com.itlebron.entity.Student;
import com.itlebron.service.StudentService;
import com.itlebron.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String port(){
        return port;
    }

    @GetMapping("/findAll")
    public List<StudentVo> findAll(){
        return studentService.findAll();
    }

    @RequestMapping("/find")
    public String find(){
        return "wwww";
    }
}
