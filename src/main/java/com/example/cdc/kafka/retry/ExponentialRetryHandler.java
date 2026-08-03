package com.example.cdc.kafka.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExponentialRetryHandler {

    public void retry(int attempt) {

        try {

            long delay = (long) Math.pow(2, attempt) * 1000;

            log.info("Retry Attempt : {} Delay : {} ms", attempt, delay);

            Thread.sleep(delay);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();

        }
    }
}