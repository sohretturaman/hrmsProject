package com.example.hrmsproject.entities.concretes;

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

    @OneToMany(mappedBy = "resumes")
    private List<Education> educations ;

    @OneToMany(mappedBy = "resumes")
    private List<Image> images ;

    @OneToMany(mappedBy = "resumes")
    private List<Technology> technologies ;

    @OneToMany(mappedBy = "resumes")
    private List<WorkExperience> workExperiences ;

    public CandidateResume() {
    }

    public CandidateResume(int id, String linkedIn, String github, String coverLetter, List<Education> educations,
                           List<Image> images, List<Technology> technologies, List<WorkExperience> workExperiences) {
        this.id = id;
        this.linkedIn = linkedIn;
        this.github = github;
        this.coverLetter = coverLetter;
        this.educations = educations;
        this.images = images;
        this.technologies = technologies;
        this.workExperiences = workExperiences;
    }
}
