package com.samuellcocktails.SamuellCocktails.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String helloFromController(){
        return "Hello from controller";
    }
}
