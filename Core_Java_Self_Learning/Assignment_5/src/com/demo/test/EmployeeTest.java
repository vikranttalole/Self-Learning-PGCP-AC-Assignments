package com.demo.test;

import com.demo.model.Employee;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Vikrant");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}