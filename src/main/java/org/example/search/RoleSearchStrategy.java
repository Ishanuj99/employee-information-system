package org.example.search;

import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class RoleSearchStrategy implements EmployeeSearchStrategy{
    @Override
    public List<Employee> search(List<Employee> employees, String role) {
        List<Employee> searchResult = new ArrayList<>();
        for(Employee employee: employees){
            if(employee.getRole().equals(role)){
                searchResult.add(employee);
            }
        }
        return searchResult;
    }
}
