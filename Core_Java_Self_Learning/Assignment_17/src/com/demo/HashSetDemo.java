package com.demo;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(101,"Vikrant"));
        set.add(new Employee(101,"Vikrant"));
        set.add(new Employee(102,"Rahul"));

        System.out.println(set);
    }
}