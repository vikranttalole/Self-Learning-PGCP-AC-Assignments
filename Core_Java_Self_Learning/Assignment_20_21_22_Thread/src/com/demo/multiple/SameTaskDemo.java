package com.demo.multiple;

public class SameTaskDemo {
    public static void main(String[] args) {
        Task t = new Task();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
    }
}
