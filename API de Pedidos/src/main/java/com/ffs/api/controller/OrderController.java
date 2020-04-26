package com.ffs.api.controller;

import com.ffs.api.model.Order;
import com.ffs.api.producer.OrderProducer;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author francisco
 */
@Slf4j
@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private OrderProducer orderProducer;

    @PostMapping
    public void send(@RequestBody @Valid Order order) {
        this.orderProducer.send(order);
    }
}
