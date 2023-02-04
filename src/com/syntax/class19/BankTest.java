package com.syntax.class19;

public class BankTest {
    public static void main(String[] args) {
        BankAccount ba=new  BankAccount();
        ba.accountNumber=2378956239587;
        ba.money=1000;

        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer(); methods definied inside child class - not available to the parent

        System.out.println("  --  Creating an Object");

        Checking    check=new   Checking();
        //features from parent
        check.accountNumber=57634;
        check.money=675;
        //features from checking class itself
        check.interest=0;

        check.deposit();//from parent
        check.transfer();//from child

    }
}
