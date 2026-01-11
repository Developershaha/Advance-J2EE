package org.Dream.service;

import org.Dream.model.Laptop;
import org.Dream.respository.LaptopResposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
@Autowired
    private LaptopResposity repo;
    public void addLaptop(Laptop lap){

        // we can write database logic and called here
        System.out.println("laptop service called");

        repo.save(lap);

    }

    public boolean isGoodForProgramming(Laptop lap){
return  true;
    }
}
