package com.example.hrmsproject.business.concretes;

import com.example.hrmsproject.business.abstracts.EmployerService;
import com.example.hrmsproject.business.verfication.abstracts.EmployerAuthService;
import com.example.hrmsproject.core.utilities.results.*;
import com.example.hrmsproject.dataAccess.abstracts.EmployerDao;
import com.example.hrmsproject.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;
    private EmployerAuthService employerAuthService ;

    @Autowired
    public EmployerManager(EmployerDao employerDao , EmployerAuthService employerAuthService){
        this.employerDao = employerDao ;
        this.employerAuthService = employerAuthService;
    }


    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Tüm iş verenler listelendi ");
    }

    @Override
    public Result add(Employer employer) {

        if (!employerAuthService.companyNameCheck(employer)) {
            return new ErrorDataResult<Employer>(null, "şirket ismi boş olamaz");

        } else if (!employerAuthService.webSiteCheck(employer)) {
            return new ErrorDataResult<Employer>(null, "web site ismi boş olamaz");

        } else if (!employerAuthService.passwordCheck(employer)) {
            return new ErrorDataResult<Employer>(null, "şifre  boş olamaz");

        } else if (!employerAuthService.emailCheck(employer)) {
            return new ErrorDataResult<Employer>(null, "EmailKullanılıyor");

        } else
            this.employerDao.save(employer);
        return new SuccessDataResult<>("iş veren hesabı eklendi");

    }

    //  this.employerDao.save(employer);
      //  return new SuccessResult(" Bu iş verenler eklendi ");


    @Override
    public List<Employer> listEmployers() {
        return this.employerDao.findAll();
    }

    @Override
    public DataResult<List<Employer>> findByEmail(String email) {
        return new SuccessDataResult <List<Employer>>  (this.employerDao.findByEmail(email));
    }
}
