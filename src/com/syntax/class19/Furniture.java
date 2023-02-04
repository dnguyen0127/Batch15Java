package com.syntax.class19;

public class Furniture {

    String  type;
    double  price;
    String  color;

    //with the help of constructor we can initialize object with specific values
    Furniture(String type, double price, String color){
        this.type=type;
        this.price=price;
        this.color=color;
    }

    /* below is a method with name Furniture
            void Furniture(){

                }
     */


        void print(){
            System.out.println(type+" price is "+price+" and color is "+color);
        }

}
