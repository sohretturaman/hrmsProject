package com.example.hrmsproject.business.verfication.abstracts;

import com.example.hrmsproject.entities.concretes.Employer;

public interface EmployerAuthService {
    boolean companyNameCheck(Employer employer);

    boolean webSiteCheck(Employer employer);

    boolean passwordCheck(Employer employer);

    boolean emailCheck(Employer employer);
}
