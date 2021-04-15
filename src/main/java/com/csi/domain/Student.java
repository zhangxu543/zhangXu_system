package com.csi.domain;

import java.util.Date;

/**
 * 学生
 * @author 張旭
 * @version 1.0
 * @date 2021/3/24 17:09
 */
public class Student {
    private String stuId;//学号
    private String stuName;//姓名
    private String stuSex;//性别
    private String stuPassword;//密码
    private String stuNative; //籍贯
    private String stuBirthday;//生日
    private Major major;//专业
    private String stuClass;//班级
    private String stuDorm;//宿舍
    private Politic politic;//政治面貌；
    private Nation nation;//民族
    private String stuIdcard;//身份证号
    private String stuAddress;//家庭住址
    private SchoolRoll schoolRoll;//学籍状态

    public Student() {
    }

    public Student(String stuId, String stuName, String stuNex, String stuPassword, String stuNative, String stuBirthday, Major major, String stuClass, String stuDorm, Politic politic, Nation nation, String stuIDcard, String stuAddress, SchoolRoll schoolRoll) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuNex;
        this.stuPassword = stuPassword;
        this.stuNative = stuNative;
        this.stuBirthday = stuBirthday;
        this.major = major;
        this.stuClass = stuClass;
        this.stuDorm = stuDorm;
        this.politic = politic;
        this.nation = nation;
        this.stuIdcard = stuIDcard;
        this.stuAddress = stuAddress;
        this.schoolRoll = schoolRoll;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuIdcard() {
        return stuIdcard;
    }

    public void setStuIdcard(String stuIdcard) {
        this.stuIdcard = stuIdcard;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getStuNative() {
        return stuNative;
    }

    public void setStuNative(String stuNative) {
        this.stuNative = stuNative;
    }

    public String getStuBirthday() {
        return stuBirthday;
    }

    public void setStuBirthday(String stuBirthday) {
        this.stuBirthday = stuBirthday;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuDorm() {
        return stuDorm;
    }

    public void setStuDorm(String stuDorm) {
        this.stuDorm = stuDorm;
    }

    public Politic getPolitic() {
        return politic;
    }

    public void setPolitic(Politic politic) {
        this.politic = politic;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public String getStuIDcard() {
        return stuIdcard;
    }

    public void setStuIDcard(String stuIDcard) {
        this.stuIdcard = stuIDcard;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public SchoolRoll getSchoolRoll() {
        return schoolRoll;
    }

    public void setSchoolRoll(SchoolRoll schoolRoll) {
        this.schoolRoll = schoolRoll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuNex='" + stuSex + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", stuNative='" + stuNative + '\'' +
                ", stuBirthday=" + stuBirthday +
                ", major=" + major +
                ", stuClass='" + stuClass + '\'' +
                ", stuDorm='" + stuDorm + '\'' +
                ", politic=" + politic +
                ", nation=" + nation +
                ", stuIDcard='" + stuIdcard + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                ", schoolRoll=" + schoolRoll +
                '}';
    }
}
