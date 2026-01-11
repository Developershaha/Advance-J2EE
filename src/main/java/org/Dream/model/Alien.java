package org.Dream.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
private int age;
    // mention here to create this object in the same cotext other wise this object will not crated ply
    private Computer comp ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }
    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void output(){

    // field injection
        System.out.println("output is here ");
        comp.compile();


    }
}
