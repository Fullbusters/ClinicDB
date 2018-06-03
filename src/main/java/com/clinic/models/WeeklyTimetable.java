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
}
