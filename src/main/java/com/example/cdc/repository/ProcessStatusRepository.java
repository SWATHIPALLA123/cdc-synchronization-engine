package com.example.cdc.repository;

import com.example.cdc.entity.ProcessStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessStatusRepository extends JpaRepository<ProcessStatus, Long> {

}