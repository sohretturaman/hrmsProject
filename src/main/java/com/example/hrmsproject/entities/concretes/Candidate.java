package com.example.hrmsproject.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@Table(name="candidates")
public class Candidate  extends User{


  // @PrimaryKeyJoinColumn(name="id")

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="identity_number")
    private String  identificationNumber;

    @Column(name="birth_date")
    private LocalDate birthDate;




    public Candidate() {
    }

    public Candidate(int id, String email, String password, String firstName, String lastName, String identificationNumber, LocalDate birthDate) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.birthDate = birthDate;
    }
}
