package com.osu.hackathonapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.osu.hackathonapi.enums.EventType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class Event implements Serializable {

  @Id private String name;

  @Transient private EventType eventType;

  // Note: Timezone is in UTC so any officer can add a meeting, and so it can be converted
  // client-side.
  // Todo: Consider adding a user body in the request w/ the timezone specified.
  //  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm", timezone = "UTC")
  //  @Temporal(TemporalType.TIMESTAMP)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  @Column(name = "start_date")
  private Date startDate;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  //  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "end_date")
  private Date endDate;

  @Column(name = "event_details")
  private String eventDetails;

  public Event() {}

  public Event(String name, Date startDate, Date endDate) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventType getEventType() {
    return this.eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return this.endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getEventDetails() {
    return this.eventDetails;
  }

  public void setEventDetails(String details) {
    this.eventDetails = details;
  }
}
