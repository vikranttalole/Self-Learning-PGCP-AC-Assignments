package com.demo;

public class WrapperDemo {

    public static void main(String[] args) {

        //Integer methods
        int a = Integer.parseInt("100");   // String → int
        System.out.println("Parsed int: " + a);

        Integer obj1 = Integer.valueOf(200);  // int → Integer
        System.out.println("ValueOf: " + obj1);

        System.out.println("Max: " + Integer.max(10, 20));
        System.out.println("Min: " + Integer.min(10, 20));

        // Double methods
        double d = Double.parseDouble("45.67");
        System.out.println("\nParsed double: " + d);

        //Character methods
        char ch = 'A';
        System.out.println("\nIs Digit: " + Character.isDigit(ch));
        System.out.println("Is Letter: " + Character.isLetter(ch));
        System.out.println("To Lower: " + Character.toLowerCase(ch));

        // Boolean methods
        boolean b = Boolean.parseBoolean("true");
        System.out.println("\nBoolean value: " + b);

        // Compare methods
        Integer x = 10;
        Integer y = 20;
        System.out.println("\nCompare: " + Integer.compare(x, y));
    }
}