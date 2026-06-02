package com.demo.streamapi;
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        list.stream()
            .map(x -> x * 2)
            .forEach(System.out::println);

        int sum = list.stream()
                      .reduce(0, Integer::sum);

        System.out.println("Sum = " + sum);

        long count = list.stream().count();

        System.out.println("Count = " + count);

        list.stream()
            .sorted()
            .forEach(System.out::println);
    }
}