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
    @JoinColumn(name = "Calendar_Id")
    private Calendar calendar;

    public Comment() {
    }

    public Comment(String comment, String time, Calendar calendar) {
        this.comment = comment;
        this.time = time;
        this.calendar = calendar;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
}
