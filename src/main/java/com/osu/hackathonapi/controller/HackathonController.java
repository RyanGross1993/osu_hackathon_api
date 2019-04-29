package com.osu.hackathonapi.controller;

import com.osu.hackathonapi.model.Event;
import com.osu.hackathonapi.model.EventResponse;
import com.osu.hackathonapi.model.Hackathon;
import com.osu.hackathonapi.service.HackathonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/hackathon")
public class HackathonController {

  @Autowired
  HackathonService hackathonService;

  @RequestMapping(method = RequestMethod.POST, produces = "application/json")
  public ResponseEntity<EventResponse> addHackathon(@RequestBody Hackathon hackathon) {
    EventResponse eventResponse = hackathonService.addHackathon(hackathon);
    return ResponseEntity.ok(eventResponse);
  }

  // Do you want to modify the dates individually, or all at once?
  @RequestMapping(value = "/{id}/date", method = RequestMethod.PUT, produces = "application/json")
  public void editHackathonDate(@RequestParam("id") String hackathonId, Hackathon hackathon) {}

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
  public void cancelHackathon(@RequestParam(value = "id") String hackathonId) {}
}
