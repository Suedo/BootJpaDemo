package com.example.springboot_mysql_jpa_lombok_demo.repository;

import com.example.springboot_mysql_jpa_lombok_demo.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
