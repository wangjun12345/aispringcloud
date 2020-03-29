package com.itlebron.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: wangjun
 * @date: 2020/3/28
 **/
@Component
public class UserTask {
    @Scheduled(cron = "*/5 * * * * ?")
    public void taskTest(){

    }
}
