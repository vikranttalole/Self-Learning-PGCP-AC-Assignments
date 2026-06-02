package com.demo;
import java.lang.reflect.Method;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Employee e = new Employee();

        Method m = Employee.class.getDeclaredMethod("show");

        m.setAccessible(true);

        m.invoke(e);
    }
}