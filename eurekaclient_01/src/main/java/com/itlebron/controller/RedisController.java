package com.itlebron.controller;

import com.itlebron.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: wangjun
 * @date: 2020/3/28
 **/
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/set")
    public boolean set(String key, String value){
        return redisUtil.set(key, value);
    }

    @RequestMapping("/get")
    public Object get(String key){
        return redisUtil.get(key);
    }




}
