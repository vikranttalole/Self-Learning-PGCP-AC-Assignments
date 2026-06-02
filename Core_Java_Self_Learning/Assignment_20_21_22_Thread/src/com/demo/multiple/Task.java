package com.demo.multiple;

class Task implements Runnable {
    public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println(Thread.currentThread().getName()+" Running");
        }
    }
}
