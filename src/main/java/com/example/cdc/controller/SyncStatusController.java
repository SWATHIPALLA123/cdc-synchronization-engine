package com.example.cdc.controller;

import com.example.cdc.entity.ProcessStatus;
import com.example.cdc.repository.ProcessStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sync")
@RequiredArgsConstructor
public class SyncStatusController {

    private final ProcessStatusRepository processStatusRepository;

    @GetMapping("/status")
    public List<ProcessStatus> getStatus() {

        return processStatusRepository.findAll();

    }

}