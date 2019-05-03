package com.osu.hackathonapi.util;

import java.util.Date;

public class DateUtil {

    public static Date getCurrentDate() {
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        return currentDate;
    }
}
