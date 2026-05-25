package com.demo;

public class BoxingUnboxingDemo {

    public static void main(String[] args) {

        // Boxing (int → Integer)
        int a = 10;
        Integer obj = Integer.valueOf(a);   // manual boxing
        Integer autoBox = a;                // auto boxing

        System.out.println("Boxing:");
        System.out.println("Primitive: " + a);
        System.out.println("Object: " + obj);
        System.out.println("AutoBox: " + autoBox);

        // Unboxing (Integer → int)
        Integer b = 20;
        int x = b.intValue();     // manual unboxing
        int autoUnbox = b;        // auto unboxing

        System.out.println("\nUnboxing:");
        System.out.println("Object: " + b);
        System.out.println("Primitive: " + x);
        System.out.println("AutoUnbox: " + autoUnbox);
    }
}