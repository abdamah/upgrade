package com.riigsoft;

import java.util.Scanner;

public class Test {
    public void test(){
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a:");
        a = scanner.nextInt();

        System.out.print("Enter b:");
        b = scanner.nextInt();


        if (a > b){
            System.out.println("a is greater than b");
        }else if(a < b){
            System.out.println("a is less than b");
        }
        else {
            System.out.println("a is equal b");
        }
    }

    public void factorial(){
        int result = 1;
        for (int i = 1; i <6; i++) {
            result = result * i;
        }

        System.out.println(result);
    }

    public  void calculator(){
  while (true) {
      System.out.print("1.Add\n2.Sub\n3.Exit\n");

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your choice:");
      int choice = scanner.nextInt();

      int a, b;



      switch(choice){
          case 1:
              System.out.print("Enter a:");
              a = scanner.nextInt();

              System.out.print("Enter b:");
              b = scanner.nextInt();
              System.out.println("sum:"+ (a+b));
              break;
          case 2:
              System.out.print("Enter a:");
              a = scanner.nextInt();

              System.out.print("Enter b:");
              b = scanner.nextInt();
              System.out.println("sub:"+ (a-b));
              break;
          case 3:
              System.exit(0);
              break;
          default:
              System.out.println("Unknown choice");
      }

  }
    }

}
