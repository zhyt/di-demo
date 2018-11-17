package com.zjlabs.didemo.controllers;

import com.zjlabs.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayHello();
    }

}
