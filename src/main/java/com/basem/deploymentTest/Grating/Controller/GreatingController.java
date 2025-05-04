package com.basem.deploymentTest.Grating.Controller;

import com.basem.deploymentTest.Grating.Service.GreatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreatingController {

    @Autowired
    private GreatingService greetingService;

    @GetMapping("/great")
    public String great() {
        return greetingService.sayHello();
    }
}
