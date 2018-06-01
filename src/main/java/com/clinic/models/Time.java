package com.clinic.models;


import javax.persistence.*;

@Entity
@Table(name="Time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Time_Id")
    private Long timeId;
    @Column(name="Date")
    private String date;
    @Column(name="Time")
    private String time;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "Patient_Id")
    private Patient patient;

    public Time() {
    }

    public Time(String date, String time, Doctor doctor, Patient patient) {
        this.date = date;
        this.time = time;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Long getTimeId() {
        return timeId;
    }

    public void setTimeId(Long timeId) {
        this.timeId = timeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Time{" +
                "timeId=" + timeId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
