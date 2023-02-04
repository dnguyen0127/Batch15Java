package com.syntax.class19;

public class Task1 {

    //Student Class

    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

     */

    String  name;
    String  address;



    Task1(String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println(name+" is a student who lives at "+address);
    }



}
