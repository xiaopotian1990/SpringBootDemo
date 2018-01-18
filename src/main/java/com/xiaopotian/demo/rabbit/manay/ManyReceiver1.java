package com.xiaopotian.demo.rabbit.manay;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zoulu on 2018-01-18.
 */
@Component
@RabbitListener(queues = "many")
public class ManyReceiver1 {

    @RabbitHandler
    public void process(String message) {
        System.out.println("Receiver 1: " + message);
    }
}
