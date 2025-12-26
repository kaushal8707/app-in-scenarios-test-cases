package com.dev.work.scenarios.dynamic_tests.model;

public class EmployeeDao {

    public Employee save(int employeeId) {
        return Employee.builder()
                .id(employeeId)
                .build();
    }

    public Employee save(int employeeId, String employeeFirstName) {
        return Employee.builder()
                .id(employeeId)
                .firstName(employeeFirstName)
                .build();
    }
}
