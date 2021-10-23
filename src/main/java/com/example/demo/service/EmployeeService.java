package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public List<Employee> searchEmployeeByDepartment(String department) throws EmployeeNotFoundException;

    public List<Employee> searchEmployeeByFirstName(String firstName);


    public void deleteEmployee(Employee employee);
}
