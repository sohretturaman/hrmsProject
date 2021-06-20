package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "work_experiences")
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "work_place")
    private String  workPlace;

    @Column(name = "start_year_work",columnDefinition = "Date default CURRENT_DATE")
    private LocalDate startYearWork = LocalDate.now();

    @Column(name = "end_year_work",columnDefinition = "Date default CURRENT_DATE" )
    private LocalDate endYearWork = LocalDate.now() ;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private  CandidateResume candidateResume ;

    @ManyToOne()
    @JoinColumn(name = "job_title_id")
    private  JobTitle jobTitle ;


    public WorkExperience() {
    }

    public WorkExperience(int id, String workPlace, LocalDate startYearWork,
                          LocalDate endYearWork, CandidateResume candidateResume, JobTitle jobTitle) {
        this.id = id;
        this.workPlace = workPlace;
        this.startYearWork = startYearWork;
        this.endYearWork = endYearWork;
        this.candidateResume = candidateResume;
        this.jobTitle = jobTitle;
    }
}
