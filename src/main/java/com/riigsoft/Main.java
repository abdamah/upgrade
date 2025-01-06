package com.riigsoft;

import java.util.Scanner;

import com.riigsoft.test.Account;


public class Main extends Account {
    public static void main(String[] args) {
//       DataTypes dt = new DataTypes();
//       dt.dataTypes();

//        Operators op = new Operators();
//        op.operators();

//        Conditonals cond = new Conditonals();
//        cond.evenOdd();
//        cond.grade();
//        cond.getDay();

//        Loops loop = new Loops();
//        loop.evenOdd();
//        loop.printFirst10Numbers();

//        Test t = new Test();
//
////        t.test();dgg
////        t.factorial();
//        t.calculator();

//        User user = fafasdfsdfsdi;fkdsfljsksf;sdkfsdk;ad
//        System.out.println(user.username);

        Account account = new Account();
        System.out.println(account.getBalance());
        account.setBalance(300);
        System.out.println(account.getBalance());
        account.withdraw(100) ;
        Main m = new Main();

        System.out.println(m.getBalance());
        m.setBalance(100);
        System.out.println(m.getBalance());
        m.withdraw(100);
        System.out.println(m.getBalance());


    }


}

class A {
    protected void test() {
        System.out.println("Testing...");
    }


}