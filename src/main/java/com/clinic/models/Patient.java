package com.clinic.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="patient")
public class Patient {


    @Id
    @GeneratedValue
    @Column(name="Patient_id")
    private Long patientId;
    @Column(name="First_Name")
    private String firstName;
    @Column(name="Last_Name")
    private String lastName;
    @Column(name="Date_of_Birth")
    private String dateOfBirth;
    @Column(name="Sex")
    private String sex;
    @Column(name="Phone_Number")
    private String phoneNumber;
    @Column(name="Info")
    private String info;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;
    @OneToMany( mappedBy = "patient")
    private List<Calendar> calendar;
    @OneToMany( mappedBy = "doctor")
    private List<Comment> comments;


}
