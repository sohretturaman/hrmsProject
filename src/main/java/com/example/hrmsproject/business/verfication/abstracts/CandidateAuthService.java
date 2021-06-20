package com.example.hrmsproject.business.verfication.abstracts;

import com.example.hrmsproject.entities.concretes.Candidate;


public interface CandidateAuthService {
    boolean checkIdNumber (Candidate candidate );
    boolean checkName (Candidate candidate);
    boolean checkLastName(Candidate candidate) ;
    boolean checkWithMernis (Candidate candidate) ;
    boolean checkPassword(Candidate candidate);
}
