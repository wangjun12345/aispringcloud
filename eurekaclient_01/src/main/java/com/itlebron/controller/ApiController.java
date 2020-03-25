package com.itlebron.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/index")
    public Map index(){
        Map map = new HashMap<>();
        map.put("name", "wj");
        return map;
    }
}
