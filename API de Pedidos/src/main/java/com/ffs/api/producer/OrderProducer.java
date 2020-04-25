package com.ffs.api.producer;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author francisco
 */
@Component
public class OrderProducer {

    @Value("${order.topic-name}")
    private String TOPIC_ORDER;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(final String order) {
        final String messageKey = UUID.randomUUID().toString();

        this.kafkaTemplate.send(this.TOPIC_ORDER, messageKey, order);
    }
}
