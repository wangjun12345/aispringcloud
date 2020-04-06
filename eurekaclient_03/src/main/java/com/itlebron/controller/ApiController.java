package com.itlebron.controller;

import com.itlebron.mq.send.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: rabbitMq接口测试类
 * @author: wangjun
 * @date: 2020/4/1
 **/
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private SendMessage sendMessage;

    @RequestMapping("/sendDirect")
    public void sendDirect(){
        sendMessage.sendDirect("sendDirect");
    }

    @RequestMapping("/sendTopic")
    public void sendTopic(){
        sendMessage.sendTopic("sendTopic");
    }

    @RequestMapping("/sendFanout")
    public void sendFanout(){
        sendMessage.sendFanout("sendFanout");
    }
}
