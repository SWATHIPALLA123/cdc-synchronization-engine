package com.example.cdc.config;

import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MicrometerConfig {

    private final MeterRegistry meterRegistry;

    @PostConstruct
    public void init() {

        meterRegistry.config().commonTags(
                "application",
                "cdc-synchronization-engine"
        );

    }

}