package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@Table(name = "languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "language_name")
    private String languageName;

    @Size(min = 1,max = 5,message = "belirsiz seviye")
    @Column(name = "level")
    private String languageLevel;

    @ManyToOne()
    @JoinColumn(name = "resume_id")
    private  CandidateResume candidateResume ;

    public Language() {
    }

    public Language(int id, String languageName,
                    String languageLevel, CandidateResume candidateResume) {
        this.id = id;
        this.languageName = languageName;
        this.languageLevel = languageLevel;
        this.candidateResume = candidateResume;
    }
}
