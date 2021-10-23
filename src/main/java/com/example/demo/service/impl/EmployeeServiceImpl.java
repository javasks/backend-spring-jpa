package com.example.demo.service.impl;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public List<Employee> searchEmployeeByDepartment(String department) {
        return employeeDao.findByDepartment(department);
    }

    @Override
    public List<Employee> searchEmployeeByFirstName(String firstName) {
        return employeeDao.findByFirstName(firstName);
    }

    @Override
    public void deleteEmployee(Employee employee) {
         employeeDao.delete(employee);
    }
}
