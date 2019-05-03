package com.osu.hackathonapi.util;

import com.osu.hackathonapi.model.EventQueryType;
import org.springframework.core.convert.converter.Converter;

public class EventStatusConverter implements Converter<String, EventQueryType> {

    @Override
    public EventQueryType convert(String source) {
        try {
            return EventQueryType.valueOf(source.toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
