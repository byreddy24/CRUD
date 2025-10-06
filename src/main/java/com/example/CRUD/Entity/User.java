package com.example.CRUD.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")   // this matches your DB table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;
    private String country;
    private String residence;
    private Integer entryExam;
    private String prevEducation;
    private Long studyHours;
    private String  python;
    private Integer db;

}




