package com.riigsoft;

public class Conditonals {
    public void evenOdd(){
        int number = 10;

        if (number % 2 == 0){
            System.out.println(number + "-even");
        }else{
            System.out.println(number + "-odd");
        }
    }

    public  void grade(){
        int score = 90;
        if (score >= 90){
            System.out.println("A+");
        } else if (score >= 80 ){
            System.out.println("A");
        }
        else if (score >=70){
            System.out.println("B+");
        }else if (score >= 60){
            System.out.println("B");
        }else if (score >=50){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }

    public void getDay(){
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Unknown day.");
        }
    }
}
