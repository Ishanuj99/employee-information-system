package org.example.model;

public abstract class Employee {
    int id;
    String department;
    String name;

    public Employee(int id, String department, String name){
        this.id = id;
        this.department = department;
        this.name = name;
    }

    public abstract String getRole();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}
