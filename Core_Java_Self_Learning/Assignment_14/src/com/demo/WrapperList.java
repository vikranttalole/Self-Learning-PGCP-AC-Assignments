package com.demo;

import java.util.*;

public class WrapperList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // insert
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("List: " + list);

        // delete
        list.remove(1);

        // search
        System.out.println(list.contains(20));

        // iterate
        for(Integer i : list) {
            System.out.println(i);
        }

        // sort
        Collections.sort(list);

        System.out.println("Sorted: " + list);
    }
}