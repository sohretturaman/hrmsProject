package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.CandidateResume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateResumeDao extends JpaRepository<CandidateResume,Integer> {

}
