package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult <List<Employer>> getAll ();
    Result add (Employer employer);
    List<Employer > listEmployers();
    DataResult <List<Employer>>  findByEmail(String email);
}
