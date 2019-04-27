package com.osu.hackathonapi.controller;

import com.osu.hackathonapi.model.Hackathon;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/hackathons")
public class HackathonController {

  @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
  public void addHackathon(Hackathon hackathon) {}

  // Do you want to modify the dates individually, or all at once?
  @RequestMapping(value = "/{id}/date", method = RequestMethod.POST, produces = "application/json")
  public void editHackathonDate(@RequestParam("id") String hackathonId, Hackathon hackathon) {}

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
  public void cancelHackathon(@RequestParam(value = "id") String hackathonId) {}
}
