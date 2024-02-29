package com.spring.springboot.service;

import com.spring.springboot.dao.EmployeeRepository;
import com.spring.springboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = null;
        Optional<Employee> emp = employeeRepository.findById(id);

        if (emp.isPresent()) {
            employee = emp.get();
        }

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
//        return employeeRepository.findAllByName(name).stream().collect(Collectors.toList());
        return new ArrayList<>(employeeRepository.findAllByName(name));
    }
}
