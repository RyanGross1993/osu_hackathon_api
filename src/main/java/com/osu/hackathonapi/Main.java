package com.osu.hackathonapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @RestController
  @RequestMapping("api/v1")
  private static class BaseController {

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> ping() {
      ResponseEntity<Void> pingResponse = new ResponseEntity<>(HttpStatus.OK);
      return pingResponse;
    }

    @RequestMapping(value= "/swagger")
    public String getDocumentation() {
      return "redirect:/swagger-ui.html";
    }
  }
}
