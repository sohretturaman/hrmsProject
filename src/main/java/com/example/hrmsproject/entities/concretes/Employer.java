package com.example.hrmsproject.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = false)  // lombok elemanı
@Entity
@Data
@Table(name = "employers")
public class Employer  extends User {

   // @PrimaryKeyJoinColumn(name="id")
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_address")
    private String webAdres;

    @Column(name = "phone_number")
    private String phoneNumber;

   @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;


    public Employer() {
    }

    public Employer(int id, String email, String password, String companyName,
                    String webAdres, String phoneNumber, List<JobAdvertisement> jobAdvertisements) {
        super(id, email, password);
        this.companyName = companyName;
        this.webAdres = webAdres;
        this.phoneNumber = phoneNumber;
        this.jobAdvertisements = jobAdvertisements;
    }

    public Employer(String companyName, String webAdres, String phoneNumber, List<JobAdvertisement> jobAdvertisements) {
        this.companyName = companyName;
        this.webAdres = webAdres;
        this.phoneNumber = phoneNumber;
        this.jobAdvertisements = jobAdvertisements;
    }
}
