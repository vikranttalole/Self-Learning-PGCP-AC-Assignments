package com.demo.generic;
import java.util.*;

public class GenericDemo {

    static void printList(List<?> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10,20,30);

        List<Number> list2 = new ArrayList<>();

        printList(list1);

        list2.add(100);

        System.out.println(list2);
    }
}