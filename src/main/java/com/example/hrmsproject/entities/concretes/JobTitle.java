package com.example.hrmsproject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "job_titles")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "job_id")
    private int jobId ;

    @Column(name="job_name")
    private String jobName;


    @JsonIgnore
    @OneToMany(mappedBy = "job_title")
    private List<JobAdvertisement> jobAdvertisementList;


    @JsonIgnore
    @OneToMany(mappedBy = "job_title")
    private List<WorkExperience> workExperiences ;

    public JobTitle() {
    }

    public JobTitle(int jobId, String jobName
                    ) {
        this.jobId = jobId;
        this.jobName = jobName;

    }
}
