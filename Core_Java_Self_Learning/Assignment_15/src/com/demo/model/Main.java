package com.demo.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Vikrant", 50000));
        list.add(new Employee(101, "Rahul", 40000));
        list.add(new Employee(102, "Sneha", 60000));

        Collections.sort(list);

        System.out.println("Sorting by ID");
        for(Employee e : list)
            System.out.println(e);

        Collections.sort(list, new SortBySalary());

        System.out.println("\nSorting by Salary");
        for(Employee e : list)
            System.out.println(e);
    }
}