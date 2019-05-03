package com.osu.hackathonapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.osu.hackathonapi.enums.ResponseMessage;
import com.osu.hackathonapi.enums.ResponseStatus;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventResponse implements Serializable {

  private ResponseStatus responseStatus;
  private ResponseMessage responseMessage;
  private Object response;

  public EventResponse() {}

  public EventResponse(ResponseStatus responseStatus, ResponseMessage responseMessage) {
    this.responseStatus = responseStatus;
    this.responseMessage = responseMessage;
  };

  public EventResponse(ResponseStatus responseStatus, Object response) {
    this.responseStatus = responseStatus;
    this.response = response;
  }

  public ResponseStatus getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(ResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }

  public ResponseMessage getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(ResponseMessage responseMessage) {
    this.responseMessage = responseMessage;
  }

  public Object getResponse() {
    return response;
  }

  public void setResponse(Event response) {
    this.response = response;
  }
}
