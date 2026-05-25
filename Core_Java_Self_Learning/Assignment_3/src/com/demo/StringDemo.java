package com.demo;

public class StringDemo {

    public static void main(String[] args) {

        String str = "I am Vikrant Talole  ";

        // Length
        System.out.println("Length: " + str.length());

        // Trim
        String trimmed = str.trim();
        System.out.println("Trim: " + trimmed);

        // Uppercase
        System.out.println("Upper: " + trimmed.toUpperCase());

        // Lowercase
        System.out.println("Lower: " + trimmed.toLowerCase());

        // Substring
        System.out.println("Substring: " + trimmed.substring(6));

        // Replace
        System.out.println("Replace: " + trimmed.replace("Java", "Core Java"));

        // Contains
        System.out.println("Contains 'Java': " + trimmed.contains("Java"));

        // Equals
        System.out.println("Equals: " + trimmed.equals("Hello Java World"));

        // CharAt
        System.out.println("Char at 1: " + trimmed.charAt(1));

        // Split
        String[] words = trimmed.split(" ");
        System.out.println("Words:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}