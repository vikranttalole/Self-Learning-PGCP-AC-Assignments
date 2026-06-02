package com.demo;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Vikrant");
        queue.add("Rahul");
        queue.add("Sneha");

        System.out.println(queue);

        System.out.println("Removed : " + queue.poll());

        System.out.println("Front : " + queue.peek());

        System.out.println(queue);
    }
}
