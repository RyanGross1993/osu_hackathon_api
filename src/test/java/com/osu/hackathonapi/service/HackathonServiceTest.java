package com.osu.hackathonapi.service;

import org.junit.Before;
import org.junit.Test;

public class HackathonServiceTest {
  private HackathonService hackathonService;

  @Before
  public void setup() {
    hackathonService = new HackathonService();
  }

  @Test
  public void addHackathonTest_Success() {}

  @Test
  public void addHackathonTest_UnavailTime() {}

  @Test
  public void addHackathonTest_Failure() {}

  @Test
  public void editHackathonTest_Success() {}

  @Test
  public void editHackathonTest_NoChanges() {}

  @Test
  public void editHackathon_Failure() {}

  @Test
  public void cancelHackathon_Success() {}

  @Test
  public void cancelHackathon_Failure() {}
}
