package com.example.hrmsproject.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data

@Table(name = "employees")
public class Employee extends User{

   // @PrimaryKeyJoinColumn(name="id")

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;



    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
    }
}
