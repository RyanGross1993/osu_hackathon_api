package com.osu.hackathonapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> ping() {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
