package com.osu.hackathonapi.util;

import com.osu.hackathonapi.model.Hackathon;

import java.time.OffsetDateTime;

public class TestUtil {

  protected static Hackathon createHackathon(String startDate, String endDate) {
    Hackathon hackathon = new Hackathon();
    OffsetDateTime offsetStartTime = DateUtil.convertToDate(startDate);
    OffsetDateTime offsetEndTime = DateUtil.convertToDate(endDate);
    hackathon.setStartDate(offsetStartTime);
    hackathon.setEndDate(offsetEndTime);
    return hackathon;
  }
}
