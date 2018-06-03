package com.clinic.models;

import javax.persistence.*;

@Entity
@Table(name="Comment")
public class Comment {

    @Id
    @GeneratedValue
    @Column(name="Comment_Id")
    private Long commentId;
    @Column(name="Comment")
    private String comment;
    @Column(name="Time")
    private String time;
    @ManyToOne
    @JoinColumn(name = "Patient_Id")
    private Patient patient;

}
