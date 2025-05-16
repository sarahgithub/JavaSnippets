package com.snippets;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class TimeUtils {

    // Converts current local time to UTC
    public static String convertLocalToUTC() {
        ZonedDateTime localDateTime = ZonedDateTime.now();
        ZonedDateTime utcDateTime = localDateTime.withZoneSameInstant(ZoneOffset.UTC);
        return utcDateTime.toString();
    }

    // Converts UTC time to local time
    public static String convertUTCToLocal(String utcTime) {
        ZonedDateTime utcDateTime = ZonedDateTime.parse(utcTime, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        ZonedDateTime localDateTime = utcDateTime.withZoneSameInstant(ZoneOffset.systemDefault());
        return localDateTime.toString();
    }
}
