package org.Dream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        // Start Spring Boot application
        ApplicationContext context =
                SpringApplication.run(Main.class, args);

        // Ask Spring IOC container for the bean
        Demo demo = context.getBean(Demo.class);
        demo.output();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//        // what is bean in spring spring
//
//      /*  Bean is nothing but java object and we can crate the java object usign new keyword and memoery allocated for that object in heap oky
//      *
//      * and any object and lifecycle of that object handle by spring is know as Bean
//      * */
//        System.out.println("hello world");
//
//        // manually created object using new keyword
//
//        Demo d=new Demo();
//        d.output();
//
//        // but i don;t want to create manually this object , i want spring create object by itself using spring ioc conatianer
//
//
//
//        }
//    }
