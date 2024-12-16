package com.riigsoft;

public class Loops {
    public void evenOdd(){
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "-even");
            }else{
                System.out.println( i + "-odd");
            }
        }
    }

    public void printFirst10Numbers(){
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " " );
        }
    }
}
