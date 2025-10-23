package com.riigsoft;

import com.sun.security.jgss.GSSUtil;

public class Main {
    private String color;
    private static String type = "Guri";

    public  Main(){
        System.out.println("default constructor");
    }

    int add(int a, int b){
        return  a + b;
    }
    void say(){
        System.out.println("hello");
    }


    public static void main(String[] args) {

      Main.type="Madaaris";

    Main m1 = new Main();
//        System.out.println(  m1.type);
        System.out.println(Main.type);
        System.out.println("Jigji");
    m1.color="Orange";
        System.out.println(m1.color);

        System.out.println("==================");
    Main m2 = new Main();
//        System.out.println(  m2.type);
        System.out.println(Main.type);
        System.out.println("Calaamadda");
    m2.color="red";
        System.out.println(m2.color);

        System.out.println("Calling add method");


        System.out.println(m2.add(2, 3));
        int result = m2.add(5,5);
        System.out.println("Result: " + result);

    }

}