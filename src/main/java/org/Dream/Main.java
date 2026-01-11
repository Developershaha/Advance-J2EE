package org.Dream;

import org.Dream.model.Alien;
import org.Dream.model.Laptop;
import org.Dream.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        // Start Spring Boot application
        ApplicationContext context =
                SpringApplication.run(Main.class);
        LaptopService service =(LaptopService) context.getBean(LaptopService.class);
        Laptop lop=context.getBean(Laptop.class);
        service.addLaptop(lop);

        // Ask Spring IOC container for the bean
        // Alien alien = context.getBean(Alien.class);
      //   alien.output();
//        Alien alien1=context.getBean(Alien.class);
//
//        alien1.output();
//
//        System.out.println("compare " +alien.equals(alien1)); // both referring to the same object creating difference refernaces

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
//        Alien d=new Alien();
//        d.output();
//
//        // but i don;t want to create manually this object , i want spring create object by itself using spring ioc conatianer
//
//
//
//        }
//    }
