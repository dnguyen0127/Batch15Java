package com.syntax.class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="KJFDKFJjsdfnlk123213$#%^$%^*)(";
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[a-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

    }
}
