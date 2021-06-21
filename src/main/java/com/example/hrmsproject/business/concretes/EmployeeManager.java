package com.example.hrmsproject.business.concretes;


import com.example.hrmsproject.business.abstracts.EmployeeService;
import com.example.hrmsproject.business.verfication.abstracts.CandidateAuthService;
import com.example.hrmsproject.core.utilities.adapters.mernisAdapter.MernisService;
import com.example.hrmsproject.core.utilities.results.*;
import com.example.hrmsproject.dataAccess.abstracts.EmployeeDao;
import com.example.hrmsproject.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;
    private CandidateAuthService candidateAuthService;
    private MernisService mernisService;

    @Autowired
    public EmployeeManager (EmployeeDao employeeDao , CandidateAuthService candidateAuthService, MernisService mernisService ){
        this.employeeDao = employeeDao;

    }


    @Override
    public DataResult<List<Employee>> getAll() {
            return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "tüm iş arayanlar listelendi");

        }



    @Override
    public Result add(Employee employee) {

       this.employeeDao.save(employee) ;
       return new SuccessResult(" iş arayan eklendi ") ;

    }

    @Override
    public List<Employee> lİstEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public DataResult<List<Employee>> findAllByEmail(String email) {
        return new SuccessDataResult <List<Employee>>(this.employeeDao.findAllByEmail(email));
    }


}
