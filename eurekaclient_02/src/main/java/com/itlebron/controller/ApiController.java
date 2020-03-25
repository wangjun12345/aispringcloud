package com.itlebron.controller;


import com.itlebron.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    //直接通过ip+端口
    @RequestMapping("/restFindAllStudent")
    public List<StudentVo> restFindAllStudent(){
        List<StudentVo> list = restTemplate.getForObject("http://localhost:8010/student/findAll", List.class);
        return list;
    }

    //通过服务中心的name调用
    @RequestMapping("/restFindAllStudent2")
    public List<StudentVo> restFindAllStudent2(){
        List<StudentVo> list = restTemplate.getForObject("http://CLIENT_01/student/findAll", List.class);
        return list;
    }
}
