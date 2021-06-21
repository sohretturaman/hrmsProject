package com.example.hrmsproject.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "resumes")
public class CandidateResume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id ;

    @Column(name = "linkedin_adress")
    private String linkedIn ;

    @Column(name = "github_adress")
    private String github ;

    @Column(name = "cover_letter")
    private String coverLetter ;


    @JsonIgnore
    @OneToMany(mappedBy = "candidateResume ")
    private List<Education> educations ;


    @JsonIgnore
    @OneToMany(mappedBy = "candidateResume")
    private List<Image> images ;


    @JsonIgnore
    @OneToMany(mappedBy = "candidateResume")
   private List<Technology> technologies ;


    @JsonIgnore
    @OneToMany(mappedBy = "candidateResume")
    private List<WorkExperience> workExperiences ;

    public CandidateResume() {
    }

    public CandidateResume(int id, String linkedIn, String github, String coverLetter
                           ) {
        this.id = id;
        this.linkedIn = linkedIn;
        this.github = github;
        this.coverLetter = coverLetter;

    }
}
