package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // bu olmayabilir aslında çünkü belirli birşehir sayısı var
    @Column(name = "id")
    private int id;

    @Column(name ="city_name")
    private String cityName ;

    @OneToMany(mappedBy = "job_adversiments")
    private List<JobAdvertisement> jobAdvertisements;  // list yapabilirsin

    public City() {
    }

    public City(int id, String cityName, List<JobAdvertisement> jobAdvertisements) {
        this.id = id;
        this.cityName = cityName;
        this.jobAdvertisements = jobAdvertisements;
    }
}
