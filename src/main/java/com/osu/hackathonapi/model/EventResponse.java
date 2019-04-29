package com.osu.hackathonapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.osu.hackathonapi.enums.ResponseMessage;
import com.osu.hackathonapi.enums.ResponseStatus;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventResponse implements Serializable {

    private ResponseStatus responseStatus;
    private ResponseMessage responseMessage;
    private Event event;

    public EventResponse() {}

    public EventResponse(ResponseStatus responseStatus, ResponseMessage responseMessage) {
        this.responseStatus = responseStatus;
        this.responseMessage = responseMessage;
    };

    public EventResponse(ResponseStatus responseStatus, Event event) {
        this.responseStatus = responseStatus;
        this.event = event;
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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
