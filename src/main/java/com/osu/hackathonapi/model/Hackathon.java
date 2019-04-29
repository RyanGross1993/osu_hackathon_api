package com.osu.hackathonapi.model;

import com.osu.hackathonapi.enums.EventType;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "HACKATHON")
public class Hackathon extends Event implements Serializable {

    public Hackathon() {
        super();
    }

    public Hackathon(String name, Date startDate, Date endDate) {
        super(name, startDate, endDate);
        setEventType(EventType.HACKATHON);
    }
}