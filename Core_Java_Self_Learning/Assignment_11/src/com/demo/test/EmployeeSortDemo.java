package com.demo.test;

import java.util.*;

import com.demo.model.Employee;

public class EmployeeSortDemo {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(103, "Vikrant", 50000));
        list.add(new Employee(101, "Rahul", 70000));
        list.add(new Employee(102, "Amit", 60000));

        // Comparable (sort by id)
        Collections.sort(list);

        System.out.println("Sort by ID:");
        for (Employee e : list) {
            System.out.println(e);
        }

        //Comparator (sort by name)
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nSort by Name:");
        for (Employee e : list) {
            System.out.println(e);
        }

        //Comparator (sort by salary)
        Collections.sort(list, (e1, e2) ->
                Double.compare(e1.getSalary(), e2.getSalary()));

        System.out.println("\nSort by Salary:");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}