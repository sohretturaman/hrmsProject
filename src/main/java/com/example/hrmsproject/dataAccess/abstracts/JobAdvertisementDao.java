package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> getByEmployerId (int employerId); // emin olman gerek
    List<JobAdvertisement> getAllByCreatedAtAndActive(); // emin olman gerek
    List<JobAdvertisement> findAllById(int id) ;
    //JobAdvertisement getByDescription(String description);
   // List<JobAdvertisementWithEmployerDto> getJobAdvertisementwithEmployer(); // burayı  kontrol et
}
