package org.example.search;

import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DepartmentSearchStrategy implements EmployeeSearchStrategy{
    @Override
    public List<Employee> search(List<Employee> employees, String department) {
        List<Employee> searchResult = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getDepartment().equals(department)){
                searchResult.add(employee);
            }
        }
        return searchResult;
    }
}
