package com.riigsoft;

public class DataTypes {
    public void dataTypes() {
        //data type
        int a = 10;
        float price = 29.99F;
        double discount = 0.5;
        char c = 'A';
        boolean isAdmin = false;
        String name = "Abdallah";
        short s = 12;
        byte b = 13;

        System.out.println("int a:" + a);
        System.out.println("float price:" + price);
        System.out.println("double discount:" + discount);
        System.out.println("char c:" + c);
        System.out.println("boolean isAdmin:" + isAdmin);
        System.out.println("String name:" + name);
        System.out.println("short s:" + s);
        System.out.println("byte:" + b);

        int i = 5;
        System.out.println("post-increment:" + i++); // i = i + 1 => 5
        System.out.println("post-increment:" + i); // i = 6


        int j = 7;
        System.out.println("pre-increment:" + ++j); // i = i + 1 => 8
        System.out.println("pre-increment:" + j);//8
    }
}
