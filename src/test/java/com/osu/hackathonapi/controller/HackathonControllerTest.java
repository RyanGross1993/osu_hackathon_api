package com.osu.hackathonapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.osu.hackathonapi.Main;
import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import com.osu.hackathonapi.service.HackathonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class HackathonControllerTest {

  @Autowired private ObjectMapper objectMapper;
//  @MockBean(name = "hackathonRepository")
  HackathonRepository hackathonRepository;
   private HackathonService hackathonService;

  private MockMvc mockMvc;
  private Hackathon hackathon;

  @Before
  public void setup() {
    hackathon = new Hackathon();
    hackathonRepository = mock(HackathonRepository.class);
//    MockitoAnnotations.initMocks(this);
//    mockMvc = MockMvcBuilders.standaloneSetup(new Main()).build();
    hackathonService = new HackathonService(hackathonRepository);
  }

  @Test
  public void addHackathonTest_Success() {
    when(hackathonRepository.findById(2L)).thenReturn(Optional.of(hackathon));
    Optional<Hackathon> x = hackathonRepository.findById(2L);
  }
}
