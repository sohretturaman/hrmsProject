package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {

    DataResult<List<JobTitle>> getAll();
    Result add(JobTitle jobTitle);
    List<JobTitle> listJobPositions ();
    DataResult<List<JobTitle>>  findAllById(int id);

}