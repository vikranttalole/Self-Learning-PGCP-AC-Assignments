package com.demo.test;

import com.demo.model.MyInterface;

public class FunctionalDemo {

    public static void main(String[] args) {

        //1. Using Anonymous Class
        MyInterface obj1 = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Using Anonymous Class");
            }
        };
        obj1.show();

        //2. Using Lambda Expression
        MyInterface obj2 = () -> {
            System.out.println("Using Lambda Expression");
        };
        obj2.show();
    }
}