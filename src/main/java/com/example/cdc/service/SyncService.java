package com.example.cdc.service;

import com.example.cdc.entity.AuditLog;
import com.example.cdc.entity.ProcessStatus;
import com.example.cdc.repository.AuditLogRepository;
import com.example.cdc.repository.ProcessStatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class SyncService {

    private final ProcessStatusRepository processStatusRepository;
    private final AuditLogRepository auditLogRepository;

    public void processEvent(String processName) {

        ProcessStatus status = ProcessStatus.builder()
                .processName(processName)
                .status("SUCCESS")
                .updatedTime(LocalDateTime.now())
                .build();

        processStatusRepository.save(status);

        AuditLog audit = AuditLog.builder()
                .eventName(processName)
                .action("SYNC_COMPLETED")
                .performedBy("SYSTEM")
                .eventTime(LocalDateTime.now())
                .build();

        auditLogRepository.save(audit);
    }
}