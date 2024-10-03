package com.example.demo.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class EmployeeController {

  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  // Default constructor
  public EmployeeController() {}

  // Constructor with parameters
  public EmployeeController(String name, String role) {
    this.name = name;
    this.role = role;
  }

  // Getter for ID
  public Long getId() {
    return this.id;
  }

  // Getter for Name
  public String getName() {
    return this.name;
  }

  // Getter for Role
  public String getRole() {
    return this.role;
  }

  // Setter for ID
  public void setId(Long id) {
    this.id = id;
  }

  // Setter for Name
  public void setName(String name) {
    this.name = name;
  }

  // Setter for Role
  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EmployeeController)) return false;
    EmployeeController employee = (EmployeeController) o;
    return Objects.equals(this.id, employee.id) &&
           Objects.equals(this.name, employee.name) &&
           Objects.equals(this.role, employee.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
  }
}
