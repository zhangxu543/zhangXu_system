package com.csi.domain;

/**
 * @author 張旭
 * @version 1.0
 * @date 2021/3/24 17:25
 */
public class StuDept {
    private int id;
    private String name;

    public StuDept() {
    }

    public StuDept(int id, String name) {
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


}
