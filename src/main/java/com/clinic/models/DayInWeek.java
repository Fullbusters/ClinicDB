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
    @OneToMany( mappedBy = "dayInWeek")
    private List<WeeklyTimetable> weeklyTimetables;

    public DayInWeek() {
    }

    public DayInWeek(String day, List<WeeklyTimetable> weeklyTimetables) {
        this.day = day;
        this.weeklyTimetables = weeklyTimetables;
    }

    public Long getDayInWeekId() {
        return dayInWeekId;
    }

    public void setDayInWeekId(Long dayInWeekId) {
        this.dayInWeekId = dayInWeekId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<WeeklyTimetable> getWeeklyTimetables() {
        return weeklyTimetables;
    }

    public void setWeeklyTimetables(List<WeeklyTimetable> weeklyTimetables) {
        this.weeklyTimetables = weeklyTimetables;
    }

    @Override
    public String toString() {
        return "DayInWeek{" +
                "dayInWeekId=" + dayInWeekId +
                ", day='" + day + '\'' +
                ", weeklyTimetables=" + weeklyTimetables +
                '}';
    }
}
