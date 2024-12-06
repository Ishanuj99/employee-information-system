package org.example.model;

public class Developer extends Employee{
    public Developer(int id, String department, String name) {
        super(id, department, name);
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}
