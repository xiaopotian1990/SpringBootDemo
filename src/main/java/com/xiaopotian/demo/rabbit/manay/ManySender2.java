package com.xiaopotian.demo.rabbit.manay;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zoulu on 2018-01-18.
 */
@Component
public class ManySender2 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i){
        String context = "spring boot many queue"+" ****** "+i;
        System.out.println("Sender2 : " + context);
        this.rabbitTemplate.convertAndSend("many", context);
    }
}
