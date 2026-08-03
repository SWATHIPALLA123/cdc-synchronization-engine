package com.example.cdc.config;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticsearchConfig extends ElasticsearchConfiguration {

    @Override
    public org.springframework.data.elasticsearch.client.ClientConfiguration clientConfiguration() {

        return org.springframework.data.elasticsearch.client.ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

    }

}