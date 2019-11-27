package com.example.myapplication;

public class Payment {
    public String getName() {
        return name;
    }

    public int getPayImg() {
        return payImg;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setPayImg(int payImg) {
        this.payImg = payImg;
    }

    private int payImg;
}
