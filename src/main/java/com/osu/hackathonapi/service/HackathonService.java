package com.osu.hackathonapi.service;

import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HackathonService {

  @Autowired protected HackathonRepository hackathonRepository;

  // TODO: Add repository.

  public void addHackathon(Hackathon hackathon) {}

  public Hackathon editHackathon(String id, Hackathon hackathon) {
    return null;
  }

  public void cancelHackathon(String hackathonId) {
    // Disband all teams
    // Delete all signups
    // Delete hackathon
  }

  public List<Hackathon> getUpcomingHackathons() {
    return null;
  }

  public List<Hackathon> getPreviousHackathons() {
    return null;
  }
}
