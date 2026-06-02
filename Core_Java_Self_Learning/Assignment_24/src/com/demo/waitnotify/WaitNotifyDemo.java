package com.demo.waitnotify;

public class WaitNotifyDemo {

    public static void main(String[] args) {

        Customer c = new Customer();

        new Thread(() -> c.withdraw(5000)).start();

        new Thread(() -> c.deposit(10000)).start();
    }
}
