package org.example;

import org.example.builder.EmployeeBuilder;
import org.example.model.Developer;
import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.example.search.DepartmentSearchStrategy;
import org.example.search.EmployeeSearchContext;
import org.example.search.EmployeeSearchStrategy;

public class Main {
    public static void main(String[] args) {
        Employee d1 = new EmployeeBuilder().setId(1).setDepartment("Krutrim").setName("Ishanuj").setRole("Developer").build();
        Employee m1 = new EmployeeBuilder().setId(2).setDepartment("AFM").setName("Ashish").setRole("Manager").build();

        EmployeeRepository repository = new EmployeeRepository();
        repository.addEmployee(d1);
        repository.addEmployee(m1);

        EmployeeSearchContext searchContext = new EmployeeSearchContext();
        EmployeeSearchStrategy departmentSearchStrategy = new DepartmentSearchStrategy();
        searchContext.setStrategy(departmentSearchStrategy);
        searchContext.search()
    }
}