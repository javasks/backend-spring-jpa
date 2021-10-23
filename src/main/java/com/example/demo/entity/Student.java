package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String seatNumber;

    public Student() {
    }

    public Student(String seatNumber) {
        this.seatNumber = seatNumber;
    }

}
