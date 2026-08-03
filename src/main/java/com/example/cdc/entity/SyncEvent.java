package com.example.cdc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sync_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SyncEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entityName;

    private String operation;

    private String topicName;

    private String status;

    private LocalDateTime processedTime;
}