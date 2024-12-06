package org.example.model;

public class Manager extends Employee{
    public Manager(int id, String department, String name) {
        super(id, department, name);
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
