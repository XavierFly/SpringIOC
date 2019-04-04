package com.xavier.practice1;

public class FoodImpl implements Food{
    private String name;
    private String taste;
    private String kind;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String toString() {
        return name + "属于" + kind + "，口味" + taste + "。";
    }
}
