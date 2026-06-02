package com.demo;
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