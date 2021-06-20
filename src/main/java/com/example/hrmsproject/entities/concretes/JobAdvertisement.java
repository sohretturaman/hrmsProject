package com.example.hrmsproject.entities.concretes;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
@Table(name = "job_adversiments")
public class JobAdvertisement {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private int Id;

   @ManyToOne()
   @JoinColumn(name="job_title_id")
    private JobTitle  jobTitle;

   @ManyToOne()
   @JoinColumn(name = "city_id")
    private City city;

   @ManyToOne()
   @JoinColumn(name="employer_id")
    private Employer employer;

   @Column(name ="description ", length = 5000)
   @Type(type="text")
   private String description ;

   @Column(name="quota ")
   private  int quota ;

   @Column (name = "min_salary")
   private double minSalary ;

   @Column(name = "mix_salary")
   private double mixSalary ;

   @Column(name="is_active")
   private boolean isActive ;

   @Column(name = "created_date", columnDefinition = "Date default CURRENT_DATE")
   private LocalDate createdAt =LocalDate.now();

   @Column(name = "application_deadline", columnDefinition = "Date default CURRENT_DATE" )
   private LocalDate applicationDeadline=LocalDate.now();

   public JobAdvertisement() {
   }

   public JobAdvertisement(int id, JobTitle jobTitle, City city, Employer employer, String description, int quota, double minSalary,
                           double mixSalary, boolean isActive, LocalDate createdAt, LocalDate applicationDeadline) {
      Id = id;
      this.jobTitle = jobTitle;
      this.city = city;
      this.employer = employer;
      this.description = description;
      this.quota = quota;
      this.minSalary = minSalary;
      this.mixSalary = mixSalary;
      this.isActive = isActive;
      this.createdAt = createdAt;
      this.applicationDeadline = applicationDeadline;
   }
}
