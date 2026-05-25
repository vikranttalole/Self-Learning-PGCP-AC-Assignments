package com.demo.test;

import com.demo.exception.InvalidAgeException;
import com.demo.exception.InvalidSalaryException;

public class ExceptionDemo {

    // Checked exception method
    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid Age");
        }
    }

    // Unchecked exception method
    public static void checkSalary(double salary) {

        if (salary < 10000) {
            throw new InvalidSalaryException("Salary too low");
        } else {
            System.out.println("Valid Salary");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkSalary(5000);
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}