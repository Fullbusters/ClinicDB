package com.clinic.models;

import javax.persistence.*;

@Entity
@Table(name="Calendar")
public class Calendar {


    @Id
    @GeneratedValue
    @Column(name="Calendar_id")
    private Long calendarId;
    @Column(name="Date")
    private String date;
    @Column(name="Visit_Start")
    private String visitStart;
    @Column(name="Visit_End")
    private String visitEnd;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "Patient_Id")
    private Patient patient;

    public Calendar() {
    }

    public Calendar(String date, String visitStart, String visitEnd, Doctor doctor, Patient patient) {
        this.date = date;
        this.visitStart = visitStart;
        this.visitEnd = visitEnd;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVisitStart() {
        return visitStart;
    }

    public void setVisitStart(String visitStart) {
        this.visitStart = visitStart;
    }

    public String getVisitEnd() {
        return visitEnd;
    }

    public void setVisitEnd(String visitEnd) {
        this.visitEnd = visitEnd;
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
        return "Calendar{" +
                "calendarId=" + calendarId +
                ", date='" + date + '\'' +
                ", visitStart='" + visitStart + '\'' +
                ", visitEnd='" + visitEnd + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
