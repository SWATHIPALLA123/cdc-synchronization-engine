package com.example.cdc.kafka.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderEvent(String message) {
        kafkaTemplate.send("orders", message);
    }

    public void sendProductEvent(String message) {
        kafkaTemplate.send("products", message);
    }

    public void sendCustomerEvent(String message) {
        kafkaTemplate.send("customers", message);
    }

    public void sendInventoryEvent(String message) {
        kafkaTemplate.send("inventory", message);
    }
}