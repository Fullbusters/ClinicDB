package com.clinic.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Day_In_Week")
public class DayInWeek {

    @Id
    @GeneratedValue
    @Column(name="Day_In_Week_Id")
    private Long dayInWeekId;
    @Column(name="Day")
    private String day;
    @OneToMany( mappedBy = "doctor")
    private List<WeeklyTimetable> weeklyTimetables;
}
