package com.anil.Jenkins_deploy_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getState(){
        return "Application is up and running";
    }
    @GetMapping("/hello")
    public String getHello(){
        return "Hello from Spring Boot";
    }
}
