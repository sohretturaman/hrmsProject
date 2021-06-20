package com.example.hrmsproject.business.concretes;

import com.example.hrmsproject.business.abstracts.JobTitleService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.core.utilities.results.SuccessDataResult;
import com.example.hrmsproject.core.utilities.results.SuccessResult;
import com.example.hrmsproject.dataAccess.abstracts.JobTitleDao;
import com.example.hrmsproject.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return  new SuccessDataResult <List<JobTitle>> (this.jobTitleDao.findAll(),"tüm iş pozisyonları listelendi");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult(" Bu iş pozisyonu eklendi");
    }

    @Override
    public List<JobTitle> listJobPositions() {
        return this.jobTitleDao.findAll();
    }

    @Override
    public DataResult<List<JobTitle>> findAllById(int id) {
        return  new SuccessDataResult <List<JobTitle>>  (this.jobTitleDao.findAllById(id));
    }
}
