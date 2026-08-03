package com.example.cdc.controller;

import com.example.cdc.entity.FailedEvent;
import com.example.cdc.repository.FailedEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/failed-events")
@RequiredArgsConstructor
public class FailedEventController {

    private final FailedEventRepository failedEventRepository;

    @GetMapping
    public List<FailedEvent> getFailedEvents() {

        return failedEventRepository.findAll();

    }

}