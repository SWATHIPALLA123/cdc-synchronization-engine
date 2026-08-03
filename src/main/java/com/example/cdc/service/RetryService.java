package com.example.cdc.service;

import com.example.cdc.entity.FailedEvent;
import com.example.cdc.repository.FailedEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetryService {

    private final FailedEventRepository failedEventRepository;

    public void saveFailedEvent(FailedEvent failedEvent) {

        failedEventRepository.save(failedEvent);

    }
}