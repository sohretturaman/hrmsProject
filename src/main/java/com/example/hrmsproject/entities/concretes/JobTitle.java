package com.example.hrmsproject.entities.concretes;

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

    @OneToMany(mappedBy = "job_title")
    private List<JobAdvertisement> jobAdvertisementList;

    @OneToMany(mappedBy = "job_title")
    private List<WorkExperience> workExperiences ;

    public JobTitle() {
    }

    public JobTitle(int jobId, String jobName, List<JobAdvertisement> jobAdvertisementList,
                    List<WorkExperience> workExperiences) {
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobAdvertisementList = jobAdvertisementList;
        this.workExperiences = workExperiences;
    }
}
