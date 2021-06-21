package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByEmail (String email);


}
