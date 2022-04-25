package com.example.amqp;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RabbitMQMessageProducer {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange, String routingKey) {
        amqpTemplate.convertAndSend(exchange, routingKey, payload);
    }
}
