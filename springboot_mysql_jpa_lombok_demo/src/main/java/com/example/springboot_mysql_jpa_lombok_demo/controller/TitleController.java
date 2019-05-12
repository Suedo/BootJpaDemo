package com.example.springboot_mysql_jpa_lombok_demo.controller;

import com.example.springboot_mysql_jpa_lombok_demo.model.Title;
import com.example.springboot_mysql_jpa_lombok_demo.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/title")
public class TitleController {

    @Autowired
    private TitleRepository titleRepository;

    @GetMapping("/all")
    public List findAll(){
        return titleRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Title> findTitleById(@PathVariable long id) {
        return titleRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
