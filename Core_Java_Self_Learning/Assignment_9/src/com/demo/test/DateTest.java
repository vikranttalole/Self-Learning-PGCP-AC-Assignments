package com.demo.test;

import java.time.LocalDate;
import com.demo.util.DateManipulator;

public class DateTest {

    public static void main(String[] args) {

        // String → Date
        LocalDate date1 = DateManipulator.stringToDate("01-01-2024");
        LocalDate date2 = DateManipulator.stringToDate("10-01-2024");

        System.out.println("Date1: " + date1);
        System.out.println("Date2: " + date2);

        // Date → String
        String formatted = DateManipulator.dateToString(date1);
        System.out.println("Formatted Date: " + formatted);

        // Days difference
        long days = DateManipulator.getDaysBetween(date1, date2);
        System.out.println("Days Between: " + days);
    }
}