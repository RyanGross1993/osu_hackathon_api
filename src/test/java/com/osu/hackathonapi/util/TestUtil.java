package com.osu.hackathonapi.util;

import com.osu.hackathonapi.model.Hackathon;

import java.util.Date;
import java.util.Calendar;

public class TestUtil {

  protected static Hackathon createHackathon() {
    Hackathon hackathon = new Hackathon(1, "Spring Hackathon '19", "Test");
    Calendar startTime = Calendar.getInstance();
    Calendar endTime = Calendar.getInstance();
    startTime.set(2019, 5, 1, 8, 00);
    endTime.set(2019, 5, 2, 11, 59);
    Date startDate = startTime.getTime();
    Date endDate = endTime.getTime();
    hackathon.setStartDate(startDate);
    hackathon.setEndDate(endDate);
    return hackathon;
  }
}
