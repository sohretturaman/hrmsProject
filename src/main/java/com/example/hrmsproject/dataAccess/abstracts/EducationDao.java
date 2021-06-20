package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDao extends JpaRepository<Education,Integer> {

}
