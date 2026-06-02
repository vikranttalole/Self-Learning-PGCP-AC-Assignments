package com.demo.join;
public class JoinDemo {
    public static void main(String[] args) throws Exception {

        Demo t1 = new Demo();

        t1.start();

        t1.join();

        System.out.println("Main Thread Finished");
    }
}
