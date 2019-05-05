package com.osu.hackathonapi.util;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class DateUtil {

    public static OffsetDateTime getCurrentDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        OffsetDateTime currentDate = OffsetDateTime.of(localDateTime, ZoneOffset.UTC);
        return null;
    }

    public static OffsetDateTime convertToDate(String dateAsString) {
        return OffsetDateTime.parse(dateAsString);
    }
}
