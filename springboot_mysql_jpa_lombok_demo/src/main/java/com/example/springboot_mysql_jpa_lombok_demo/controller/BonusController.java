package com.example.springboot_mysql_jpa_lombok_demo.controller;


import com.example.springboot_mysql_jpa_lombok_demo.model.Bonus;
import com.example.springboot_mysql_jpa_lombok_demo.repository.BonusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/bonus")
public class BonusController {

    @Autowired
    private BonusRepository bonusRepository;

    @GetMapping("/all")
    public List findAll(){
        return bonusRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bonus> findBonusById(@PathVariable long id) {
        return bonusRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
