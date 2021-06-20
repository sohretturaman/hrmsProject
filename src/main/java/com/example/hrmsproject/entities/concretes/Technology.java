package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "technologies")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "technology_name")
    private String technologyName ;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private  CandidateResume candidateResume ;

    public Technology() {
    }

    public Technology(int id, String technologyName, CandidateResume candidateResume) {
        this.id = id;
        this.technologyName = technologyName;
        this.candidateResume = candidateResume;
    }
}
