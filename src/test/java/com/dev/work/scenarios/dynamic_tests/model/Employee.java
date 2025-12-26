package com.dev.work.scenarios.dynamic_tests.model;

import lombok.Builder;
import lombok.ToString;

@Builder
public class Employee {
    private int id;
    private String firstName;

    public Employee(int id) {
        this.id = id;
    }
    public Employee(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
