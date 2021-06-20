package com.example.hrmsproject.business.verfication.concretes;

import com.example.hrmsproject.business.verfication.abstracts.EmployerAuthService;
import com.example.hrmsproject.dataAccess.abstracts.EmployerDao;
import com.example.hrmsproject.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerAuthManager  implements EmployerAuthService {

    private EmployerDao employerDao ;

    @Autowired
    public EmployerAuthManager (EmployerDao employerDao ){
        this.employerDao = employerDao ;
    }

    @Override
    public boolean companyNameCheck(Employer employer) {
        if (employer.getCompanyName().isBlank() || employer.getCompanyName() == null ){
            return false;
        }
        return true;
    }

    @Override
    public boolean webSiteCheck(Employer employer) {
        if (employer.getWebAdres().isBlank()| employer.getWebAdres() == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean passwordCheck(Employer employer) {
        if (employer.getPassword().isBlank() || employer.getPassword() == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean emailCheck(Employer employer) {
        if ( employerDao.findByEmail(employer.getEmail()).stream().count()  == 0){
            return false;
        }
        return  true;
    }
}
