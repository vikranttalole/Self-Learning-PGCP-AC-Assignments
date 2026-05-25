package com.demo.test;

import java.time.LocalDate;

import com.demo.util.DateManipulator;

public class DateDemo {

    public static void main(String[] args) {

        // String → Date
        LocalDate d1 =
                DateManipulator.stringToDate("01-01-2024");

        LocalDate d2 =
                DateManipulator.stringToDate("15-01-2024");

        System.out.println("Date 1: " + d1);
        System.out.println("Date 2: " + d2);

        // Date → String
        String formatted =
                DateManipulator.dateToString(d1);

        System.out.println("Formatted Date: " + formatted);

        // Days difference
        long days =
                DateManipulator.getDaysBetween(d1, d2);

        System.out.println("Days Between: " + days);
    }
}