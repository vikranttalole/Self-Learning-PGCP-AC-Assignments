package com.demo.notifyall;
class Test {

    synchronized void display() {

        try {
            System.out.println(Thread.currentThread().getName()+" waiting");
            wait();
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" resumed");
    }

    synchronized void wakeup() {

        notifyAll();
    }
}