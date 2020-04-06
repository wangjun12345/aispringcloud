package com.itlebron.mq.send;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: 生产者
 * @author: wangjun
 * @date: 2020/4/2
 **/
@Component
public class SendMessage {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendDirect(String msg){
        rabbitTemplate.convertAndSend("exchange_direct", "routing_key_direct", msg);
    }

    public void sendTopic(String msg){
        rabbitTemplate.convertAndSend("exchange_topic", "1.topic", msg);
    }

    public void sendFanout(String msg){
        rabbitTemplate.convertAndSend("exchange_fanout", "", msg);
    }
}
