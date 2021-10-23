package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Long> {

    public List<Employee> findByFirstName(String firstName);

    public List<Employee> findByDepartment(String department);
}
