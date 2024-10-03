package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    // Default constructor (already present)
    Employee() {}

    // Make this constructor public
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters and setters...
}
