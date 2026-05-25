package com.demo;

public class StringTypesDemo {

    public static void main(String[] args) {

        // String (Immutable)
        String s = "Vikrant";
        s.concat(" Talole");   // not changing original
        System.out.println("String: " + s);

        //StringBuffer (Mutable, thread-safe)
        StringBuffer sb = new StringBuffer("Vikrant");
        sb.append(" Talole");
        System.out.println("StringBuffer: " + sb);

        // StringBuilder (Mutable, fast)
        StringBuilder sb2 = new StringBuilder("Vikrant");
        sb2.append(" Talole");
        System.out.println("StringBuilder: " + sb2);
    }
}