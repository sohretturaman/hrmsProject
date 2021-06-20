package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    List<JobTitle> findAllById(int id);
}
