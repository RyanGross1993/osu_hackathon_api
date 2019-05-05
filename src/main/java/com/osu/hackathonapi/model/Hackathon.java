package com.osu.hackathonapi.model;

import com.osu.hackathonapi.enums.EventType;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity(name = "hackathon")
public class Hackathon extends Event implements Serializable {

  public Hackathon() {
    super();
  }

  public Hackathon(String name, OffsetDateTime startDate, OffsetDateTime endDate) {
    super(name, startDate, endDate);
    setEventType(EventType.HACKATHON);
  }
}
