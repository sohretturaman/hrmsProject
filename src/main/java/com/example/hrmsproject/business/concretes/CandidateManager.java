package com.example.hrmsproject.business.concretes;

import com.example.hrmsproject.business.abstracts.CandidateService;
import com.example.hrmsproject.business.verfication.abstracts.CandidateAuthService;
import com.example.hrmsproject.core.utilities.adapters.mernisAdapter.MernisService;
import com.example.hrmsproject.core.utilities.results.*;
import com.example.hrmsproject.dataAccess.abstracts.CandidateDao;
import com.example.hrmsproject.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    private CandidateDao candidateDao;
    private CandidateAuthService candidateAuthService;
    private MernisService mernisService; // aslında bu olmayabilir çünkü core katmanında adaptermanager ve interface olur .
    // bununla bilikte business katmanında bir verification paketi olur bunlarda yine abstaractve concretesler olur
    // böylece onların managerlerinde merniservice yi autowired edip fonksiyonları yazarız sonra diğer iş katmanlarında
    // bu sefer verification ların  abstractalarını kullanırsın böylece managerlerde kolaylıkla kod yazarsın

    @Autowired
    public CandidateManager(CandidateDao candidateDao, CandidateAuthService candidateAuthService, MernisService mernisService) {
        this.candidateDao = candidateDao;
        this.candidateAuthService = candidateAuthService;
        this.mernisService = mernisService;
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), " tüm adaylar  başarıyla listelendi ");
    }

    @Override
    public Result add(Candidate candidate) {
        if (candidateDao.findAllByEmail(candidate.getEmail()).stream().count() != 0 || candidate.getEmail().isBlank()) {
            return new ErrorResult(" aynı  mail den var ");

        } else if (!candidateAuthService.checkIdNumber(candidate)) {
            return new ErrorResult(" tc boş bırakılamaz ");

        } else if (!candidateAuthService.checkName(candidate)) {
            return new ErrorDataResult<Candidate>(null, " isim boş bırakılamaz ");

        } else if (!candidateAuthService.checkLastName(candidate)) {
            return new ErrorDataResult<Candidate>("soyad boş bırakılamaz");

        } else if (!candidateAuthService.checkPassword(candidate)) {
            return new ErrorDataResult<Candidate>(null, " şifre boş bırakılamaz ");

        } else this.candidateDao.save(candidate);
        return new SuccessDataResult<>(" bu iş arayan hesabı başarıyla eklendi ");


    }

    @Override
    public Result mernis(Candidate candidate) {
        if (candidateAuthService.checkWithMernis(candidate)) {
            return new SuccessResult(" iş arayanın kimlik doğrulamsı başarıyla yapıldı ");
        }else return  new ErrorResult( " iş arayanın kimlik doğrulamsı başarısız ");
    }

    @Override
    public DataResult<List<Candidate>> findAllByEmail(String email) {
        return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAllByEmail(email));


    }
}

