package com.example.springboot_mysql_jpa_lombok_demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long WORKER_ID;

    private String FIRST_NAME;
    private String LAST_NAME;
    private Long SALARY;

    @Column(name = "JOINING_DATE", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date JOINING_DATE;

    private String DEPARTMENT;

}
