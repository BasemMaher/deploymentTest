package com.basem.deploymentTest.Grating.Service;


import com.basem.deploymentTest.Grating.Repo.GreatingRepostory;
import org.springframework.stereotype.Service;

@Service
public class GreatingService {

    private final GreatingRepostory greatingRepostory;

    public GreatingService(GreatingRepostory greatingRepostory) {
        this.greatingRepostory = greatingRepostory;
    }
    public String sayHello(){
       return greatingRepostory.sayHello();
    }
}
