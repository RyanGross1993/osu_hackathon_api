package com.osu.hackathonapi.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

// Reference: https://gdpotter.com/2017/05/24/custom-spring-mvc-jackson/
@Configuration
public class JacksonConfig {

    @Autowired
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        return objectMapper;
    }
}
