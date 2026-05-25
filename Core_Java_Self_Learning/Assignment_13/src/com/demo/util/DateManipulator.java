package com.demo.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateManipulator {

    // String to Date
    public static LocalDate stringToDate(String str) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return LocalDate.parse(str, formatter);
    }

    // Date to String
    public static String dateToString(LocalDate date) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return date.format(formatter);
    }

    // Days between dates
    public static long getDaysBetween(LocalDate d1, LocalDate d2) {

        return ChronoUnit.DAYS.between(d1, d2);
    }
}