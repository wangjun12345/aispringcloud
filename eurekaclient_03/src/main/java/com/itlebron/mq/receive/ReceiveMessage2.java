package com.itlebron.mq.receive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: wangjun
 * @date: 2020/4/2
 **/
@Component
//@RabbitListener(queues = "queue_topic")
public class ReceiveMessage2 {

//    @RabbitHandler
//    public void message(String content){
//        System.out.println("client-03-queue_topic：" + content);
//    }

}
