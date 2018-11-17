package com.zjlabs.didemo.controllers;

import com.zjlabs.didemo.services.GreetingsService;

public class SetterInjectedController {
    private GreetingsService greetingsService;

    public String sayHello(){
        return greetingsService.sayHello();
    }

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
}
