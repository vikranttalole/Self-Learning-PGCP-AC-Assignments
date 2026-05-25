package com.demo.test;

import java.util.*;

public class WrapperListDemo {

    public static void main(String[] args) {

        // Create list
        List<Integer> list = new ArrayList<>();

        // Insert
        list.add(50);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        System.out.println("After Insert: " + list);

        // Delete
        list.remove(Integer.valueOf(30));   // remove element
        System.out.println("After Delete: " + list);

        // Search
        boolean found = list.contains(20);
        System.out.println("Is 20 present? " + found);

        // Iterate
        System.out.println("Iterating:");
        for (Integer i : list) {
            System.out.println(i);
        }

        //Sort
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}