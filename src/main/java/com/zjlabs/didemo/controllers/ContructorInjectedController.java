package com.zjlabs.didemo.controllers;

import com.zjlabs.didemo.services.GreetingsService;

public class ContructorInjectedController {

    private GreetingsService greetingsService;

    public ContructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello(){
        return greetingsService.sayHello();
    }
}
