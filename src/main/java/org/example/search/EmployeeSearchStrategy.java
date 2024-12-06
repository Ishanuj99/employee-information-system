package org.example.search;

import org.example.model.Employee;

import java.util.List;

public interface EmployeeSearchStrategy {
    List<Employee> search(List<Employee> employees, String searchField);
}
