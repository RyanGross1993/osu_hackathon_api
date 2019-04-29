package com.osu.hackathonapi.service;

import static com.osu.hackathonapi.enums.ResponseStatus.SUCCESSFUL;
import static com.osu.hackathonapi.enums.ResponseStatus.FAILURE;

import com.osu.hackathonapi.enums.ResponseMessage;
import com.osu.hackathonapi.model.EventResponse;
import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HackathonService {

  @Autowired protected HackathonRepository hackathonRepository;

  public HackathonService() {}

  public HackathonService(HackathonRepository hackathonRepository) {
    this.hackathonRepository = hackathonRepository;
  }

  // TODO: Add repository.

  private boolean doesHackathonConflict(Hackathon hackathon) {
    Date startDate = hackathon.getStartDate();
    Date endDate = hackathon.getEndDate();
    List<Hackathon> hackathons =
        hackathonRepository.findAllByStartDateGreaterThanEqualAndEndDateLessThanEqual(
            startDate, endDate);
    return hackathons.isEmpty();
  }

  public EventResponse addHackathon(Hackathon hackathon) {
    EventResponse eventResponse;
    if (!doesHackathonConflict(hackathon)) {
      eventResponse = new EventResponse(FAILURE, ResponseMessage.HACKATHON_TIME_CONFLICT);
    } else {
      hackathonRepository.save(hackathon);
      eventResponse = new EventResponse(SUCCESSFUL, ResponseMessage.SUCCESS);
    }
    return eventResponse;
  }

  public HackathonRepository getHackathonRepository() {
    return hackathonRepository;
  }

  public void setHackathonRepository(HackathonRepository hackathonRepository) {
    this.hackathonRepository = hackathonRepository;
  }

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
