package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkExperienceDao extends JpaRepository<WorkExperience,Integer> {


}
