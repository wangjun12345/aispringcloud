package com.itlebron.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("remote")
public class RemoteConfigController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/showConfig")
    public String showConfig(){
        return "port：" + port;
    }
}
