package com.ss.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // This is a test controller
    @RequestMapping("/")
    public String sayHello(){
        return ("Hello, This is Susanta Testing Spring boot in WildFly");
    }
}
