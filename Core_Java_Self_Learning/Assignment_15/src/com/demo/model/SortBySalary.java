package com.demo.model;
import java.util.Comparator;

class SortBySalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}