package com.riigsoft.interfac;

// Base interface
public interface Shape {
    // public abstract keywords are optional
    // by default interface methods are public abstract

    public  abstract  void area();
}

// Child interface
interface  B  extends  Shape{
    /*
    * This interface contains one method from base
    * */
}

// Multiple interface for multiple inheritance
interface C {
    void m ();
}
interface  D {
    void m();
}

interface E extends C, D{
    /*
    * This interface has two parents
    * Has two methods
    * */

    /*
    * NOTE: DIAMOND PROBLEM solved
    * Interface inherits two methods for same name
    * so it will resolve with prefixed with interface name
    * like C.m and D.m
    *
    * */
}