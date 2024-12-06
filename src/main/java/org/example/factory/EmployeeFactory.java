package org.example.factory;

import org.example.model.Developer;
import org.example.model.Employee;
import org.example.model.HR;
import org.example.model.Manager;

public class EmployeeFactory {
    public static Employee createEmployee(String role, int id, String name, String department){
        switch (role){
            case "Manager":
                return new Manager(id, department, name);
            case "HR":
                return new HR(id, department, name);
            case "Developer":
                return new Developer(id, department, name);
            default:
                throw new IllegalArgumentException("No such role found in the company");
        }
    }
}
