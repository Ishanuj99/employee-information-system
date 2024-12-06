package org.example.builder;

import org.example.factory.EmployeeFactory;
import org.example.model.Employee;

public class EmployeeBuilder {
    private int id;
    private String name;
    private String department;
    private String role;

    public EmployeeBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public Employee build() {
        return EmployeeFactory.createEmployee(role, id, name, department);
    }
}
