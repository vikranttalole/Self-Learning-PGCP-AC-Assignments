package com.demo.notifyall;
public class NotifyAllDemo {

    public static void main(String[] args) {

        Test t = new Test();

        new Thread(() -> t.display(),"t1").start();
        new Thread(() -> t.display(),"t2").start();

        try {
            Thread.sleep(2000);
        } catch(Exception e) {}

        new Thread(() -> t.wakeup()).start();
    }
}
