package com.demo;
public class DeadlockDemo {

    static Object resource1 = new Object();
    static Object resource2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized(resource1) {
                System.out.println("Thread 1 locked Resource 1");

                synchronized(resource2) {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized(resource2) {
                System.out.println("Thread 2 locked Resource 2");

                synchronized(resource1) {
                    System.out.println("Thread 2 locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
