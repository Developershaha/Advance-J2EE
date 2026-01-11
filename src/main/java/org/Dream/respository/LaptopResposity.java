package org.Dream.respository;

import org.Dream.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopResposity {

    public  void save(Laptop lop){
        System.out.println("saved in repo");

    }
}
