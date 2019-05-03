package com.osu.hackathonapi.enums;

import java.io.Serializable;

public enum ResponseMessage implements Serializable {
  HACKATHON_TIME_CONFLICT,
  SUCCESS;

  @Override
  public String toString() {
    switch (this) {
      case HACKATHON_TIME_CONFLICT:
        return "Hackaton exists within timeframe";
      default:
        return "API Call Successful";
    }
  }
}
