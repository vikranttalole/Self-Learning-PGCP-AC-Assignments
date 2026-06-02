package com.demo.runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        Thread t2 = new Thread(new MyTask());

        t1.start();
        t2.start();
    }
}