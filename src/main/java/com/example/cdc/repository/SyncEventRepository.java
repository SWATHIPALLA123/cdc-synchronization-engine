package com.example.cdc.repository;

import com.example.cdc.entity.SyncEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyncEventRepository extends JpaRepository<SyncEvent, Long> {

}