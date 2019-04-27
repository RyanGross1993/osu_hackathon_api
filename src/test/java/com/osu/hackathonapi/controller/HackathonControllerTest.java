package com.osu.hackathonapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.osu.hackathonapi.Main;
import com.osu.hackathonapi.repository.HackathonRepository;
import com.osu.hackathonapi.service.HackathonService;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class HackathonControllerTest {

  @Autowired private ObjectMapper objectMapper;

  private MockMvc mockMvc;
  private HackathonRepository hackathonRepository;
  private HackathonService hackathonService;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(new Main()).build();
  }
}
