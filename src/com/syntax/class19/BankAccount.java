package com.syntax.class19;

public class BankAccount { //parent class or super class

    long    accountNumber;

    double  money;

    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }


}

class   Checking extends BankAccount{ //child class or subclass or derived class

    double  interest;
    void transfer(){
        System.out.println("transfer methods from Checking class");
    }

}
