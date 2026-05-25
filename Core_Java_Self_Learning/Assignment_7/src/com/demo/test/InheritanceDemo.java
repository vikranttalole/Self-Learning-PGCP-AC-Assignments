package com.demo.test;

import com.demo.inheritance.*;

public class InheritanceDemo {

    public static void main(String[] args) {

        //Single inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        //Hierarchical inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}