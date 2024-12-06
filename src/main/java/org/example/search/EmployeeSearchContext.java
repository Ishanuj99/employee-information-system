package org.example.search;

import org.example.model.Employee;

import java.util.List;

public class EmployeeSearchContext {
    private EmployeeSearchStrategy strategy;
    public void setStrategy(EmployeeSearchStrategy strategy){
        this.strategy = strategy;
    }
    public List<Employee> search(List<Employee> employees, String searchField){
        return strategy.search(employees, searchField);
    }
}
