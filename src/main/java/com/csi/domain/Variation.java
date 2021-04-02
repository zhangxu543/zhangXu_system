package com.csi.domain;

import java.util.Date;

/**
 * 学籍变更
 * @author 张旭
 * @version 1.0
 * @date 2021/3/27 17:34
 */
public class Variation {
    private int id;
    private Student student;
    private Date time;
    private String description;

    public Variation() {
    }

    public Variation(int id, Student student, Date time, String desc) {
        this.id = id;
        this.student = student;
        this.time = time;
        this.description = desc;
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
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "Variation{" +
                "id=" + id +
                ", student=" + student +
                ", time=" + time +
                ", desc='" + description + '\'' +
                '}';
    }
}