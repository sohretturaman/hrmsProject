package com.example.hrmsproject.business.verfication.abstracts;

import com.example.hrmsproject.entities.concretes.JobTitle;

public interface JobCheckService {
    boolean checkJobId(JobTitle jobTitle);
}
