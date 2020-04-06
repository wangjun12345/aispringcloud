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
//@RabbitListener(queues = "queue_direct")
public class ReceiveMessage1 {

//    @RabbitHandler
//    public void message(String content){
//        System.out.println("client-03-queue_direct的消息：" + content);
//    }

}
