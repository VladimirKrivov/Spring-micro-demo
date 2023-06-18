package ru.example.micro.demo.eurekaclienttwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class Controller {

    @GetMapping("/name")
    public String name(){
        return "Hello, samurai";
    }
}
