package com.clinic.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
    @JsonIgnore
    @OneToOne(mappedBy = "doctor")
    private User user;
    @ManyToOne
    @JoinColumn(name = "Specialty_Id")
    private Specialty specialty;
    @JsonIgnore
    @OneToMany(mappedBy = "doctor",fetch = FetchType.EAGER)
    private List<Patient> patients;
    @JsonIgnore
    @OneToMany( mappedBy = "doctor")
    private List<Calendar> calendar;
    @JsonIgnore
    @OneToMany( mappedBy = "doctor")
    private List<WeeklyTimetable> weeklyTimetables;

    public Doctor() {
    }

    public Doctor(String name, String phoneNumber, String sex, String info,  User user, Specialty specialty, List<Patient> patients, List<Calendar> calendar, List<WeeklyTimetable> weeklyTimetables) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.info = info;
        this.user = user;
        this.specialty = specialty;
        this.patients = patients;
        this.calendar = calendar;
        this.weeklyTimetables = weeklyTimetables;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Calendar> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<Calendar> calendar) {
        this.calendar = calendar;
    }

    public List<WeeklyTimetable> getWeeklyTimetables() {
        return weeklyTimetables;
    }

    public void setWeeklyTimetables(List<WeeklyTimetable> weeklyTimetables) {
        this.weeklyTimetables = weeklyTimetables;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", info='" + info + '\'' +
                ", user=" + user +
                ", specialty=" + specialty +
                ", patients=" + patients +
                ", calendar=" + calendar +
                ", weeklyTimetables=" + weeklyTimetables +
                '}';
    }
}
