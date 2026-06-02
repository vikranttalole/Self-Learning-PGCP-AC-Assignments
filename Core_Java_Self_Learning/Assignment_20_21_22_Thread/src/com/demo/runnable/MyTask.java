package com.demo.runnable;

class MyTask implements Runnable {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}