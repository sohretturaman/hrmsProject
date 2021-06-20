package com.example.hrmsproject.business.verfication.concretes;

import com.example.hrmsproject.business.verfication.abstracts.JobCheckService;
import com.example.hrmsproject.entities.concretes.JobTitle;
import org.springframework.stereotype.Service;

@Service
public class JobCheckManager implements JobCheckService {

    @Override
    public boolean checkJobId(JobTitle jobTitle) {
        if (jobTitle.getJobId() == jobTitle.getJobId()) {
            return false;
        }else return true ;
    }
}
