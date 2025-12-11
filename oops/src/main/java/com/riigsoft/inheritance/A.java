package com.riigsoft.inheritance;
/*Inheritance
* only public, default and protected members can be
* inherited
*
* */


// Single Inheritance
//Base class A
public class A {
    public void a(){
    }
}
class B extends A{
    /*
    * This B class has two methods
    * One from Base /parent class
     * */
    public void b(){}
}

// Multi-level inheritance
// class 1
class Class1 {
    public void m1(){}
}

// Class 2
class Class2 extends Class1 {
    public void m2(){}
}

// class 3
class Class3 extends Class2 {
    /*
    * This class contains 3 methods
    * one from class1(m1) and one from class2(m2)
    * and its own methods (3)
    * */
    public void m3(){}
}

// Multiple inheritance
/*
* Java does not support multiple inheritance
* through classes , it supports via interfaces
* */
// NOTE: DIAMOND PROBLEM

// Hierarchical inheritance
// Base class
class Shape{
    public void area(){}
}

//Two children
class Triangle extends Shape{
    /* Has one method from Shape*/
}
class Rectangle extends Shape{
    /* Has one method from Shape*/
}
