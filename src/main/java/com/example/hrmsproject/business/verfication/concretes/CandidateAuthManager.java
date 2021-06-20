package com.example.hrmsproject.business.verfication.concretes;

import com.example.hrmsproject.business.verfication.abstracts.CandidateAuthService;
import com.example.hrmsproject.core.utilities.adapters.mernisAdapter.MernisService;
import com.example.hrmsproject.entities.concretes.Candidate;
import com.example.hrmsproject.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidateAuthManager implements CandidateAuthService {

    private MernisService mernisService;

    @Autowired
    public CandidateAuthManager(MernisService mernisService ){
        this.mernisService = mernisService ;
    }


    @Override
    public boolean checkIdNumber(Candidate candidate) {

        if (candidate.getIdentificationNumber().isBlank()||candidate.getIdentificationNumber() == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean checkName(Candidate candidate) {

        if (candidate.getFirstName().isEmpty() || candidate.getFirstName() == null){

            return false;
        }
        else return true;
    }

    @Override
    public boolean checkLastName(Candidate candidate) {
        if (candidate.getLastName().isEmpty() || candidate.getLastName()==null){
            return false;
        }else return true ;

    }

    @Override
    public boolean checkWithMernis(Candidate candidate) {
        if (mernisService.auth(candidate ) == false){
            return false;
        }
        return true;

    }

    @Override
    public boolean checkPassword(Candidate candidate) {
        if ( candidate.getPassword().isBlank() || candidate.getPassword()==null) {
            return false;
        } else return true ;
    }

}


// not isBlank:  Bir Dizenin boşluk, boş ("") veya null olup olmadığını kontrol eder.
//
// StringUtils.isBlank(null)      = true
// StringUtils.isBlank("")        = true
// StringUtils.isBlank(" ")       = true
// StringUtils.isBlank("bob")     = false
// StringUtils.isBlank("  bob  ") = false
//Karşılaştırma için StringUtils.isEmpty :
//
// StringUtils.isEmpty(null)      = true
// StringUtils.isEmpty("")        = true
// StringUtils.isEmpty(" ")       = false
// StringUtils.isEmpty("bob")     = false
// StringUtils.isEmpty("  bob  ") = false
