package com.syntax.class16;

public class QuizPractice {
    public static void main(String[] args) {
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);
    }

}
