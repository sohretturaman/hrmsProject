package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.JobAdvertisement;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement> >  getByEmployerId (int employerId);
    DataResult<List<JobAdvertisement> > getAllByCreatedAtAndActive();
    DataResult<List<JobAdvertisement> > findAllById(int id) ;
    Result add (JobAdvertisement jobAdvertisement);
}
