package com.osu.hackathonapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "hackathon")
public class Hackathon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "desc")
    private String desc;

    public Hackathon() {}

    // Hackathon constructor does not need the dates as they can be tentative.
    public Hackathon(int id, String name, String desc) {
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
