package com.osu.hackathonapi.controller;

import com.osu.hackathonapi.model.EventResponse;
import com.osu.hackathonapi.model.EventQueryType;
import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.service.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/hackathons")
public class HackathonController {

  @Autowired HackathonService hackathonService;

  @RequestMapping(method = RequestMethod.POST, produces = "application/json")
  public ResponseEntity<EventResponse> addHackathon(@RequestBody Hackathon hackathon) {
    EventResponse eventResponse = hackathonService.addHackathon(hackathon);
    return ResponseEntity.ok(eventResponse);
  }

  @RequestMapping(method = RequestMethod.GET, produces = "application/json")
  public ResponseEntity<EventResponse> getCurrentHackathons(@RequestParam EventQueryType query) {
    EventResponse eventResponse = hackathonService.getHackathons(query);
    return ResponseEntity.ok(eventResponse);
  }

  // Do you want to modify the dates individually, or all at once?
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = "application/json")
  public ResponseEntity<EventResponse> editHackathonDate(
      @PathVariable("id") String hackathonId, Hackathon hackathon) {
    return null;
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
  public ResponseEntity<EventResponse> cancelHackathon(
      @PathVariable(value = "id") String hackathonId) {
    // Take into consideration how you need to deal w/ the foreign keys.
    // Remove all associated teams and students from their respective tables.
    return null;
  }
}
