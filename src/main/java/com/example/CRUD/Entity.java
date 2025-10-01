package com.example.CRUD;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Lombok: generates getters, setters, toString(),equals(), and hashCode()
@NoArgsConstructor // Lombok: Generates a no-argument constructor, which is required by JPA
@AllArgsConstructor
@jakarta.persistence.Entity
@Table(name="users") //maps to your "Users" table in your database
public class Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name", nullable = false)
    private String fistName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(name="Age")
    private Integer age;
    @Column(name="gender")
    private String Gender;
    @Column(name="country")
    private String Country;
    @Column(name="residence")
    private String Residence;
    @Column(name = "entryExam")
    private Long EntryExam;
    @Column(name = "prevEducation")
    private String PrevEducation;
    @Column(name = "studyHours")
    private Long StudyHours;
    @Column(name="Python")
    private Long python;
    @Column(name="DB")
    private Integer db;

}

