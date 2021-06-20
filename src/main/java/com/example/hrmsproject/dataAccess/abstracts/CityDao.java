package com.example.hrmsproject.dataAccess.abstracts;

import com.example.hrmsproject.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {


}
