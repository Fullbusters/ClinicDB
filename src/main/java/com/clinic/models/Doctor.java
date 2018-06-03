package com.clinic.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="Doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Doctor_Id")
    private Long doctorId;
    @Column(name="Name")
    private String name;
    @Column(name="Phone_Number")
    private String phoneNumber;
    @Column(name="Sex")
    private String sex;
    @Column(name="Info")
    private String info;
    @Column(name="Working_hours")
    private String workingHours;
    @ManyToOne
    @JoinColumn(name = "Specialty_Id")
    private Specialty specialty;
    @OneToMany(mappedBy = "doctor",fetch = FetchType.EAGER)
    private List<Patient> patients;
    @OneToMany( mappedBy = "doctor")
    private List<Calendar> calendar;
    @OneToMany( mappedBy = "doctor")
    private List<WeeklyTimetable> weeklyTimetables;


}
