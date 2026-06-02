package com.demo.waitnotify;
class Customer {

    int amount = 1000;

    synchronized void withdraw(int amount) {

        System.out.println("withdraw process started");

        if(this.amount < amount) {
            System.out.println("insufficient balance, waiting...");
            try {
                wait();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        this.amount -= amount;
        System.out.println("withdraw completed");
    }

    synchronized void deposit(int amount) {

        System.out.println("deposit process started");

        this.amount += amount;

        notify();

        System.out.println("deposit completed");
    }
}

