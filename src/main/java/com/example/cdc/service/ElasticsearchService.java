package com.example.cdc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ElasticsearchService {

    public void sync(String entity, String data) {

        log.info("Synchronizing {} to Elasticsearch", entity);

        log.info("Payload : {}", data);

    }

}