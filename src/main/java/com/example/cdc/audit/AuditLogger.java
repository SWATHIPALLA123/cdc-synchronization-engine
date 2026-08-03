package com.example.cdc.audit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AuditLogger {

    public void log(String action, String entity) {

        log.info("AUDIT -> Action : {} Entity : {}", action, entity);

    }

}