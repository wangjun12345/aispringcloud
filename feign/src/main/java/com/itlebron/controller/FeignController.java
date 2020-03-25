package com.itlebron.controller;

import com.itlebron.feign.FeignForClientOne;
import com.itlebron.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("feign")
public class FeignController {

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

    /*@RequestMapping("/clientOne/port")
    public String port(){
        try{
            return feignForClientOne.port();
        }catch (Exception e){
            return "服务无法访问！";
        }
    }*/
}
