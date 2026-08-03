package com.example.cdc.kafka.dlq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DeadLetterConsumer {

    @KafkaListener(topics = "cdc-dlq", groupId = "cdc-group")
    public void consume(String message) {

        log.error("Dead Letter Queue Message: {}", message);

    }
}