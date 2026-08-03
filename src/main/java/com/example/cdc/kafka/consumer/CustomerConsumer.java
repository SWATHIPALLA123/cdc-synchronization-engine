package com.example.cdc.kafka.consumer;

import com.example.cdc.service.SyncService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerConsumer {

    private final SyncService syncService;

    @KafkaListener(topics = "customers", groupId = "cdc-group")
    public void consume(String message, Acknowledgment acknowledgment) {

        log.info("Received Customer Event : {}", message);

        syncService.processEvent("CUSTOMER");

        acknowledgment.acknowledge();
    }
}