package com.csi.domain;

import java.util.Date;

/**
 * 奖罚
 * @author 张旭
 * @version 1.0
 * @date 2021/3/27 17:37
 */
public class AwarePunish {
    private int id;
    private Student student;
    private String levels;
    private String description;
    private String times;
    private int status;
    private String classroom;

    public AwarePunish() {
    }

    public AwarePunish(int id, Student student, String levels, String description, String time, int state) {
        this.id = id;
        this.student = student;
        this.levels = levels;
        this.description = description;
        this.times = time;
        this.status = state;
        this.classroom=student.getStuClass();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
        this.classroom =student.getStuClass();
    }

    public String getClassroom() {
        return classroom;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimes() {



        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getState() {
        return status;
    }

    public void setState(int state) {
        this.status = state;
    }

    @Override
    public String toString() {
        return "AwarePunish{" +
                "id=" + id +
                ", student=" + student +
                ", levels='" + levels + '\'' +
                ", description='" + description + '\'' +
                ", times=" + times +
                ", status=" + status +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}