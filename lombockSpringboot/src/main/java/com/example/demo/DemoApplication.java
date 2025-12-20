package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

        // TodoWithLombok
       TodoWithLombok t1 = new TodoWithLombok();
        System.out.println("t1: "+t1);

        TodoWithLombok t2 =
                new TodoWithLombok(1, "Abdallah", true);
        System.out.println(t2);
        // update name
        t2.setName("Create login button");
        System.out.println("t2: "+ t2);


        //Without Lombok
        var t3 = new TodoWithoutLombok(); // No args constructor
        System.out.println("t3: "+ t3);

        var t4 = new TodoWithoutLombok(1);// Single Arg constructor
        System.out.println("t4: " + t4);

        var t5 = new TodoWithoutLombok(1,"Abdallah", false); // All Args constructor
        System.out.println("t5: "+ t5);


	}

}
