package com.marco.RestApiWithSpringBoot.entities;

import javax.persistence.*;

@Table(name = "tasks")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

}
