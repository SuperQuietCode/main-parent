package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * kafka测试
 *
 * @author ZhaoXin
 * @date 2020/11/13 9:28
 */
@RestController
@Slf4j
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    public KafkaController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @GetMapping("/kafkaDemo")
    @Transactional(rollbackFor = Exception.class)
    public void sendMsg() {
        kafkaProducer.send("this is a test kafka topic message!");
    }
}
