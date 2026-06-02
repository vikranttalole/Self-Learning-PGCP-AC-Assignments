package com.demo;
public class LambdaThreadDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("lambda thread 1");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("lambda thread 2");
        });

        t1.start();
        t2.start();
    }
}