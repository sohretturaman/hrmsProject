package com.example.hrmsproject.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "users")
 // @Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;


    @Column(name= "email")
    @NotBlank
    @NotNull
    @Email
    private String email;


    @Column(name = "password")
    @NotBlank
    @NotNull
    private String password;

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User() {
    }
}
