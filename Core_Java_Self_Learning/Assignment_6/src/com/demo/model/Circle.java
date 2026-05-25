package com.demo.model;

public class Circle extends Shape {

    private double radius;   // Encapsulation

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }
}