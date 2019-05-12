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
public class Title {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // not needed as not primary key
    @Column(name = "WORKER_REF_ID")
    private Long id;

    @Column(name = "WORKER_TITLE")
    private String title;

    @Column(name = "AFFECTED_FROM", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date affectedFrom;

}
