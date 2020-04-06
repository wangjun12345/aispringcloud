package com.itlebron.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: RabbitMq配置类
 * @author: wangjun
 * @date: 2020/4/1
 **/

@Configuration
public class RabbitMqConfig {

    /**
     * 交换机名称
     * */
    private final static String exchange_direct = "exchange_direct";
    private final static String exchange_topic = "exchange_topic";
    private final static String exchange_fanout = "exchange_fanout";
    /**
     * 队列名称
     * */
    private final static String queue_direct = "queue_direct";
    private final static String queue_topic = "queue_topic";
    private final static String queue_fanout = "queue_fanout";
    /**
     * 路由键
     * */
    private final static String routing_key_direct = "routing_key_direct";
    private final static String routing_key_topic = "*.topic";
    private final static String routing_key_fanout = "routing_key_fanout";

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange(exchange_direct);
    }

    @Bean
    public Queue directQueue(){
        return new Queue(queue_direct, true);
    }

    @Bean
    public Binding directBinding(Queue directQueue, DirectExchange directExchange){
        return BindingBuilder.bind(directQueue).to(directExchange).with(routing_key_direct);
    }
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(exchange_topic);
    }

    @Bean
    public Queue topicQueue(){
        return new Queue(queue_topic, true);
    }

    @Bean
    public Binding topicBinding(Queue topicQueue, TopicExchange topicExchange){
        return BindingBuilder.bind(topicQueue).to(topicExchange).with(routing_key_topic);
    }
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(exchange_fanout);
    }

    @Bean
    public Queue fanoutQueue(){
        return new Queue(queue_fanout, true);
    }

    @Bean
    public Binding fanoutBinding(Queue fanoutQueue, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(fanoutQueue).to(fanoutExchange);
    }




    /* @Bean
    public Binding binding() {
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(routing_key_direct);
    }*/


}
