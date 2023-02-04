package com.syntax.class19;

public class Task2 {
    /*
    Write Book Class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String  name;
    int     pages;
    int     chapters;

    Task2(String name, int pages){
        this.name=name;
        this.pages=pages;
    }

    Task2(String name, int pages, int chapters){
        this(name, pages);
        this.chapters=chapters;

    }

    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Pages: "+pages);
        System.out.println("Chapters: "+chapters);



    }


}
