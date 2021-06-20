package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id ;

    @Column(name = "url")
    private String url ;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private  CandidateResume candidateResume ;

    public Image() {
    }

    public Image(int id, String url, CandidateResume candidateResume) {
        this.id = id;
        this.url = url;
        this.candidateResume = candidateResume;
    }
}
