package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "educations")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "department")
    private String department;

    @Column(name = "start_year_school" , columnDefinition = "Date default CURRENT_DATE")
    private LocalDate startYearOfSchool =LocalDate.now();

    @Column(name = "end_year_school" , columnDefinition = "Date default CURRENT_DATE" )
    private LocalDate endYearOfSchool =LocalDate.now()  ;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private  CandidateResume candidateResume ;

    public Education() {
    }

    public Education(int id, String schoolName, String department, LocalDate startYearOfSchool,
                     LocalDate endYearOfSchool, CandidateResume candidateResume) {
        this.id = id;
        this.schoolName = schoolName;
        this.department = department;
        this.startYearOfSchool = startYearOfSchool;
        this.endYearOfSchool = endYearOfSchool;
        this.candidateResume = candidateResume;
    }
}
