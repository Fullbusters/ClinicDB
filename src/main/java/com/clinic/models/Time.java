package com.clinic.models;


import javax.persistence.*;

@Entity
@Table(name="Time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Time_Id")
    private Long timeId;
    @Column(name="Day")
    private String dat;
    @Column(name="Time")
    private String time;


}
