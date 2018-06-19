package com.clinic.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="Weekly_Timetable")
public class WeeklyTimetable {

    @Id
    @GeneratedValue
    @Column(name="Weekly_Timetable_id")
    private Long weeklyTimetableId;
    @Column(name="Start_date")
    private String start_date;
    @Column(name="End_date")
    private String end_date;
    @Column(name="Duration_Visit")
    private String durationVisit;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;

    public WeeklyTimetable() {
    }

    public WeeklyTimetable(String start_date, String end_date, String durationVisit, Doctor doctor) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.durationVisit = durationVisit;
        this.doctor = doctor;
    }

    public Long getWeeklyTimetableId() {
        return weeklyTimetableId;
    }

    public void setWeeklyTimetableId(Long weeklyTimetableId) {
        this.weeklyTimetableId = weeklyTimetableId;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDurationVisit() {
        return durationVisit;
    }

    public void setDurationVisit(String durationVisit) {
        this.durationVisit = durationVisit;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
