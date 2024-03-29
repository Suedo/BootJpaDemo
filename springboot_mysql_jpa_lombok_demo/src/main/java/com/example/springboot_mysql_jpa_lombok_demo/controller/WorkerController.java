package com.example.springboot_mysql_jpa_lombok_demo.controller;

import com.example.springboot_mysql_jpa_lombok_demo.model.Worker;
import com.example.springboot_mysql_jpa_lombok_demo.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/worker")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/all")
    public List findAll(){
        return workerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findWorkerById(@PathVariable long id){
        return  workerRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
