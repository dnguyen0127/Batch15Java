package com.syntax.class11;

public class CatTester {
    public static void main(String[] args) {

        //creating an object from the Cat class
        Cat joplin = new Cat();

        joplin.name =       "joplin";
        joplin.breed =      "domestic";
        joplin.age =        7;
        joplin.color =      "mix";
        joplin.attitude =   false;
        joplin.eat();


        Cat theon  = new Cat();
        theon.name =    "theon";
        theon.breed =   "mix";
        theon.color =   "gray";

        System.out.println(theon.breed);
        theon.speak();


    }
}
