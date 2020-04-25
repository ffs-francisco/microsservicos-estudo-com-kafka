package com.ffs.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 *
 * @author francisco
 */
@Slf4j
@Component
public class OrderConsumer {

    @KafkaListener(topics = "${order.topic-name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(String order) {
        log.info("Order : " + order);
    }
}
