package com.example.hrmsproject.business.concretes;

import com.example.hrmsproject.business.abstracts.JobAdvertisementService;
import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.core.utilities.results.SuccessDataResult;
import com.example.hrmsproject.core.utilities.results.SuccessResult;
import com.example.hrmsproject.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrmsproject.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }


    @Override
    public DataResult<List<JobAdvertisement>> getByEmployerId(int employerId) { // her firmanın iş ilanları
        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementDao.getByEmployerId(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByCreatedAtAndActive() { // zmana göre sıralama

         Sort sort = Sort.by(Sort.Direction.ASC,"createdAt");
        return new SuccessDataResult <List<JobAdvertisement>>
                (this.jobAdvertisementDao.findAll(sort),"sıralama başarılı" );
    }

    @Override
    public DataResult<List<JobAdvertisement>> findAllById(int id) { // hepsini sırala
        return new SuccessDataResult <List<JobAdvertisement>>
                (this.jobAdvertisementDao.findAllById(id));
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult(" bu iş ilanı  başarıyla eklendi ") ;
    }
}
