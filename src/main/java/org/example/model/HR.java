package org.example.model;

public class HR extends Employee{
    public HR(int id, String department, String name) {
        super(id, department, name);
    }

    @Override
    public String getRole() {
        return "HR";
    }
}