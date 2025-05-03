package com.basem.deploymentTest.Grating.Controller;

import com.basem.deploymentTest.Grating.Service.GreatingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreatingController {

private final GreatingService greatingService;

    public GreatingController(GreatingService greatingService) {
        this.greatingService = greatingService;
    }


    @GetMapping("/great")
    public String sayHello(){
        return greatingService.sayHello();
    }

}
