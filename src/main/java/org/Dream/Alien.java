package org.Dream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    // mention here to create this object in the same cotext other wise this object will not crated ply
    @Autowired
    Laptop laptop ;
    public void output(){

    // field injection
        System.out.println("output is here ");
        laptop.compile();


    }
}
