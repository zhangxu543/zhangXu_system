package com.csi.domain;

/**
 * 教师部门
 * @author 張旭
 * @version 1.0
 * @date 2021/3/24 17:25
 */
public class TeaDept {
    private int id;
    private String name;

    public TeaDept() {
    }

    public TeaDept(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "TeaDept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
