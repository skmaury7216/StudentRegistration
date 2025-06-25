package com.university.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String code;
    private String name;
    private String description;
    private String instructor;
    private String daysTimes;
    private String location;
    private int capacity;
    private int enrolledCount;
    private String prerequisites;

    // Getters and setters
}
