package com.shramko.spring.springboot.jpa.spring_boot_jpa.dao;

import com.shramko.spring.springboot.jpa.spring_boot_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);


}
