package com.example.hrmsproject.business.abstracts;

import com.example.hrmsproject.core.utilities.results.DataResult;
import com.example.hrmsproject.core.utilities.results.Result;
import com.example.hrmsproject.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    DataResult <List<Candidate>> getAll ();
    Result add (Candidate  candidate);
    Result mernis (Candidate candidate);
    DataResult< List<Candidate>>findAllByEmail(String email);
}
