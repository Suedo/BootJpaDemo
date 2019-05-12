package com.example.springboot_mysql_jpa_lombok_demo.repository;

import com.example.springboot_mysql_jpa_lombok_demo.model.Bonus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonusRepository extends JpaRepository<Bonus, Long> {
}
