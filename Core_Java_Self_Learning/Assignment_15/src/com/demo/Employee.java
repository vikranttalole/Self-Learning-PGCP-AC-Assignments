package com.demo;
import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee e) {
        return this.id - e.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameSort implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

public class EmployeeSort {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(2,"Ram"));
        list.add(new Employee(1,"Amit"));
        list.add(new Employee(3,"Sham"));

        Collections.sort(list);
        System.out.println("Sort by ID");
        System.out.println(list);

        Collections.sort(list,new NameSort());
        System.out.println("Sort by Name");
        System.out.println(list);
    }
}