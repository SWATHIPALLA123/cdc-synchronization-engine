package com.example.cdc.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic orderTopic() {
        return new NewTopic("orders", 1, (short) 1);
    }

    @Bean
    public NewTopic productTopic() {
        return new NewTopic("products", 1, (short) 1);
    }

    @Bean
    public NewTopic customerTopic() {
        return new NewTopic("customers", 1, (short) 1);
    }

    @Bean
    public NewTopic inventoryTopic() {
        return new NewTopic("inventory", 1, (short) 1);
    }
}