package com.demo;

public class AnonymousThreadDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                System.out.println("thread 1 running");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("thread 2 running");
            }
        };

        t1.start();
        t2.start();
    }
}
