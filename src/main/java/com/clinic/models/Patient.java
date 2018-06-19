package com.clinic.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    @OneToOne(mappedBy = "patient")
    private User user;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;
    @JsonIgnore
    @OneToMany( mappedBy = "patient")
    private List<Calendar> calendar;


    public Patient() {
    }

    public Patient(String firstName, String lastName, String dateOfBirth, String sex, String phoneNumber, String info, User user, Doctor doctor, List<Calendar> calendar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.info = info;
        this.user = user;
        this.doctor = doctor;
        this.calendar = calendar;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Calendar> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Calendar> calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", info='" + info + '\'' +
                ", user=" + user +
                ", doctor=" + doctor +
                ", calendar=" + calendar +
                '}';
    }
}
