package com.csi.domain;

/**
 * 专业
 * @author 張旭
 * @version 1.0
 * @date 2021/3/24 17:25
 */
public class Major {
    private int id;
    private String name;
    private int dept_id;

    public Major() {
    }

    public Major(int id, String name, int dept_id) {
        this.id = id;
        this.name = name;
        this.dept_id = dept_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept_id=" + dept_id +
                '}';
    }
}