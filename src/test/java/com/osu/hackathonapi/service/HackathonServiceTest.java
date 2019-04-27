package com.osu.hackathonapi.service;

import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class HackathonServiceTest {

  private HackathonRepository hackathonRepository;
  private HackathonService hackathonService;

  @Before
  public void setup() {
    hackathonRepository = mock(HackathonRepository.class);
    hackathonService = new HackathonService();

    doNothing().when(hackathonRepository).save(any());
  }

  @Test
  public void addHackathonTest_Success() {

  }

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
