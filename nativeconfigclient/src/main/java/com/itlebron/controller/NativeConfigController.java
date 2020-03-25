package com.itlebron.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("native")
public class NativeConfigController {
    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @RequestMapping("/showConfig")
    public String showConfig(){
        return "port：" + port + "  foo：" + foo;
    }
}
