package com.osu.hackathonapi.service;

import static com.osu.hackathonapi.enums.ResponseStatus.SUCCESSFUL;
import static com.osu.hackathonapi.enums.ResponseStatus.FAILURE;

import com.osu.hackathonapi.enums.ResponseMessage;
import com.osu.hackathonapi.model.EventResponse;
import com.osu.hackathonapi.model.EventQueryType;
import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.repository.HackathonRepository;
import com.osu.hackathonapi.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
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
    OffsetDateTime startDate = hackathon.getStartDate();
    OffsetDateTime endDate = hackathon.getEndDate();
    List<Hackathon> hackathons =
        hackathonRepository.findAllByStartDateGreaterThanEqualAndEndDateLessThanEqual(
            startDate, endDate);
    return (!hackathons.isEmpty());
  }

  public EventResponse addHackathon(Hackathon hackathon) {
    EventResponse eventResponse;
    if (doesHackathonConflict(hackathon)) {
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

  public EventResponse getHackathons(EventQueryType eventQueryType) {
    OffsetDateTime currentDate = DateUtil.getCurrentDate();
    List<Hackathon> hackathons = null;

    EventResponse eventResponse;

    switch (eventQueryType) {
      case PREVIOUS:
        hackathons = getPreviousHackathons(currentDate);
        break;
      case IN_PROGRESS:
        hackathons = getCurrentHackathons(currentDate);
        break;
      case UPCOMING:
        hackathons = getUpcomingHackathons(currentDate);
        break;
      default:
        hackathons = getAll();
        break;
    }
    eventResponse = new EventResponse(SUCCESSFUL, hackathons);
    return eventResponse;
  }

  public List<Hackathon> getAll() {
    return hackathonRepository.getAll();
  }

  public List<Hackathon> getCurrentHackathons(OffsetDateTime date) {
    // TODO: Configure custom query for repo.
    List<Hackathon> currentHackathons = null;
    return currentHackathons;
  }

  public List<Hackathon> getUpcomingHackathons(OffsetDateTime date) {
    List<Hackathon> previousHackathons = hackathonRepository.findAllByStartDateGreaterThan(date);
    return previousHackathons;
  }

  public List<Hackathon> getPreviousHackathons(OffsetDateTime date) {
    return hackathonRepository.findAllByStartDateGreaterThan(date);
  }
}
