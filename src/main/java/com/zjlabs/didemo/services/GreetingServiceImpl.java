package com.zjlabs.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingsService {

    public static final String HELLO_GURUS = "Hello gurus!!!";

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
