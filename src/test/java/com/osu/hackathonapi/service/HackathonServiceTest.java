package com.osu.hackathonapi.service;

import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.*;

public class HackathonServiceTest {

  @Mock
  private HackathonRepository hackathonRepository;

  @InjectMocks
  @Spy
  private HackathonService hackathonService;

  private Hackathon hackathon = new Hackathon();

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    when(hackathonRepository.save(any(Hackathon.class))).thenReturn(hackathon);
//    hackathonRepository = mock(HackathonRepository.class);
//    hackathonService = new HackathonService();

//    doNothing().when(hackathonRepository).save(any());
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
