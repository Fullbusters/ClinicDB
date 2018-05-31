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

    public Doctor() {
    }

    public Doctor(String name, String phoneNumber, String sex, String info, String workingHours, Specialty specialty, List<Patient> patients) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.info = info;
        this.workingHours = workingHours;
        this.specialty = specialty;
        this.patients = patients;
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

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
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

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", info='" + info + '\'' +
                ", workingHours='" + workingHours + '\'' +
                ", specialty=" + specialty +
                ", patients=" + patients +
                '}';
    }
}
