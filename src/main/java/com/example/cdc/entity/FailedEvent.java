package com.example.cdc.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "failed_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FailedEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entityName;

    @Column(length = 1000)
    private String reason;

    private Integer retryCount;

    private String status;

    private LocalDateTime createdAt;
}