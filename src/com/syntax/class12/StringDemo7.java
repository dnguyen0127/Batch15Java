package com.syntax.class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I");

        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));


        //Method chaining is when multiple methods are called on the same line

        System.out.println(str.toLowerCase().startsWith("i"));

    }
}
