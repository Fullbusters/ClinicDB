package com.clinic.models;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    @Column(name="User_id")
    private Long userId;
    @Column(name="Nickname")
    private String nickname;
    @Column(name="Password")
    private String Password;
    @OneToOne(mappedBy = "user")
    private Patient patient;
    @OneToOne(mappedBy = "user")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Role role;

    public User() {
    }

    public User(String nickname, String password, Patient patient, Doctor doctor, Role role) {
        this.nickname = nickname;
        Password = password;
        this.patient = patient;
        this.doctor = doctor;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
