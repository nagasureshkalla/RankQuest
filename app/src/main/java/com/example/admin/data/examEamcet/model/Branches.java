package com.example.admin.data.examEamcet.model;

import com.google.gson.annotations.SerializedName;

public class Branches implements Comparable<Branches>{

    @SerializedName("branch")
    private String branch;
    @SerializedName("seats_Filled")
    private String seats_fill;
    @SerializedName("seats_Avaliable")
    private String seats_avali;
    @SerializedName("percentageSeatsFillied")
    private String percent;
    @SerializedName("name")
    private String name;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSeats_fill() {
        return seats_fill;
    }

    public void setSeats_fill(String seats_fill) {
        this.seats_fill = seats_fill;
    }

    public String getSeats_avali() {
        return seats_avali;
    }

    public void setSeats_avali(String seats_avali) {
        this.seats_avali = seats_avali;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public Branches(String branch, String seats_fill, String seats_avali, String percent, String name) {
        this.branch = branch;
        this.seats_fill = seats_fill;
        this.seats_avali = seats_avali;
        this.percent = percent;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Branches o) {
        return getName().compareTo(o.getName());
    }
}
