package me.dio.repository;

import me.dio.model.AccessHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessHistoryRepository extends JpaRepository<AccessHistory, Long> {
}