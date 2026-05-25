package com.demo.test;

import com.demo.model.Circle;
import com.demo.model.Shape;

public class OOPDemo {

    public static void main(String[] args) {

        // Polymorphism (parent reference)
        Shape s = new Circle();

        // Encapsulation
        Circle c = (Circle) s;
        c.setRadius(5.5);

        // Abstraction + Polymorphism
        s.draw();
    }
}