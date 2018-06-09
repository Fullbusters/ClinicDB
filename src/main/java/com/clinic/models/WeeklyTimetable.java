package com.clinic.models;

import javax.persistence.*;

@Entity
@Table(name="Weekly_Timetable")
public class WeeklyTimetable {

    @Id
    @GeneratedValue
    @Column(name="Weekly_Timetable_id")
    private Long weeklyTimetableId;
    @Column(name="Start")
    private String start;
    @Column(name="End")
    private String end;
    @Column(name="Duration_Visit")
    private String durationVisit;
    @ManyToOne
    @JoinColumn(name = "Doctor_Id")
    private Doctor doctor;
    @ManyToOne
    @JoinColumn(name = "Day_In_Week_Id")
    private DayInWeek dayInWeek;

    public WeeklyTimetable() {
    }

    public WeeklyTimetable(String start, String end, String durationVisit, Doctor doctor, DayInWeek dayInWeek) {
        this.start = start;
        this.end = end;
        this.durationVisit = durationVisit;
        this.doctor = doctor;
        this.dayInWeek = dayInWeek;
    }

    public Long getWeeklyTimetableId() {
        return weeklyTimetableId;
    }

    public void setWeeklyTimetableId(Long weeklyTimetableId) {
        this.weeklyTimetableId = weeklyTimetableId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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

    public DayInWeek getDayInWeek() {
        return dayInWeek;
    }

    public void setDayInWeek(DayInWeek dayInWeek) {
        this.dayInWeek = dayInWeek;
    }


}
