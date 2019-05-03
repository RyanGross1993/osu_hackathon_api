package com.osu.hackathonapi.model;

import java.io.Serializable;

public enum EventQueryType implements Serializable {
  PREVIOUS,
  IN_PROGRESS,
  UPCOMING,
  ALL,
}
