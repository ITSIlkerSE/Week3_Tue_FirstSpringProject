package de_neuefische.week3_tue_firstspringproject.controller;


import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("HelloWorld")


public class HelloWorldController {

    String name = " ";


    @GetMapping
    public String helloWorld() {
        return "HelloWorld";


    }


    @GetMapping("/sec")
    public String helloWorld2(){
        return "Hello" + name;
    }


    @GetMapping(path = "{name}")
    public String greetVisitor(){
        return "Hello -  " + name + " length of name is : " + name.length();

    }




    @PostMapping
    public String postName (@RequestBody String newName){
        name = newName;
        return "New name is set to : " + name + " length of name is : " + name.length();

    }

}

