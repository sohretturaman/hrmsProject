package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult <List<Employee>> getAll ();
    Result  add (Employee employee) ;
    List<Employee> lİstEmployees ();
    DataResult <List<Employee>>findAllByEmail (String email);

}
