package com.example.max.mainwindow.museumpackage;

import android.graphics.Bitmap;

public class Museum {
    //Класс музея
    private String mname;
    private String adress;
    private String phone;
    private String URL;
    private String website;
    private String trivia;
    private double v;
    private double v1;



    public Museum(String mname, String adress, String phone, String URL, String website, String trivia, double v, double v1) {
        this.mname = mname;
        this.adress = adress;
        this.phone = phone;
        this.URL = URL;
        this.website = website;
        this.trivia=trivia;
        this.v=v;
        this.v1=v1;
    }


    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTrivia() {
        return trivia;
    }

    public void setTrivia(String trivia) {
        this.trivia = trivia;
    }
}
