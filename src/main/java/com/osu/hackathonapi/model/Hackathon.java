package com.osu.hackathonapi.model;

import java.util.Date;

public class Hackathon {
    private String id;
    private String name;
    private Date startDate;
    private Date endDate;
    private String desc;

    public Hackathon() {}

    // Hackathon constructor does not need the dates as they can be tentative.
    public Hackathon(String id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
