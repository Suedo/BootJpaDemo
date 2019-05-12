package com.example.springboot_mysql_jpa_lombok_demo.controller;

import com.example.springboot_mysql_jpa_lombok_demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/workers"})
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
    public List findAll(){
        return workerRepository.findAll();
    }
}
