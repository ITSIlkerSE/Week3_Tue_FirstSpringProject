package de_neuefische.week3_tue_firstspringproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("HelloWorld")


public class HelloWorldController {


    @GetMapping
    public String helloWorld() {
        return "HelloWorld";


    }


}

