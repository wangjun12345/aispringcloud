package com.itlebron.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/ribbon")
public class StudentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/port")
    public String port(){
        return restTemplate.getForObject("http://client-01/student/port", String.class);
    }

}
