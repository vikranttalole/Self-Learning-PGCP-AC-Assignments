package com.demo;
import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        return this.id == e.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + name;
    }
}


