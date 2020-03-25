package com.itlebron.controller;

import com.itlebron.feign.FeignForClientOne;
import com.itlebron.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hystrix")
public class HystrixController {

    @Autowired
    private FeignForClientOne feignForClientOne;

    @RequestMapping("/clientOne/findAll")
    public List<StudentVo> findAll(){
        return feignForClientOne.findAll();
    }

    @RequestMapping("/clientOne/port")
    public String port(){
        return feignForClientOne.port();
    }

}
