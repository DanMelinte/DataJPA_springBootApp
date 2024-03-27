package com.spring.springboot.dao;

import com.spring.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//    @Query("select count(e) from Employee e")
//    long getAll();


    List<Employee> findAllByName(String name);
}
