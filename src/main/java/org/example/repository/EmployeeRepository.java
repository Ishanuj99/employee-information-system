package org.example.repository;

import org.example.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        for(Employee emp: employeeList){
            if(employee.getId() == emp.getId()){
                employeeList.remove(employee);
                break;
            }
        }
    }
}
