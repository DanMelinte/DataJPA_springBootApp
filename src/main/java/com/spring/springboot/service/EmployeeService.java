package com.spring.springboot.service;
import com.spring.springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);

    public void deleteEmployee(int id);

    public List<Employee> getEmployeesByName(String name);
}
