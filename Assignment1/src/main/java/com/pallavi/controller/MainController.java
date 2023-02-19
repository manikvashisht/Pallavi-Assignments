package com.pallavi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World";
    }

    @GetMapping("/name/{name}")
    public String getName(@PathVariable String name){
        return "My Name is "+ name;
    }

    @GetMapping("/details")
    public String returnDetails(@RequestParam int age) {
        return "My age is :" + age;
    }
}
