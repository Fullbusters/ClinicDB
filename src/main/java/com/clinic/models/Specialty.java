package com.clinic.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Specialty")
public class Specialty {

    @Id
    @GeneratedValue
    @Column(name="Specialty_id")
    private Long specialtyId;
    @Column(name="Name")
    private String name;
    @Column(name="Info")
    private String info;
    @JsonIgnore
    @OneToMany(mappedBy = "specialty",fetch = FetchType.EAGER)
    private List<Doctor> doctor;

    public Specialty() {
    }

    public Specialty(String name, String info, List<Doctor> doctor) {
        this.name = name;
        this.info = info;
        this.doctor = doctor;
    }

    public Long getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Long specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(List<Doctor> doctor) {
        this.doctor = doctor;
    }
}
