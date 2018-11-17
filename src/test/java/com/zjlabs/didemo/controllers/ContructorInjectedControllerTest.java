package com.zjlabs.didemo.controllers;

import com.zjlabs.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {
    private ContructorInjectedController contructorInjectedController;

    @Before
    public void setUp() throws  Exception{
        this.contructorInjectedController = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreetings(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS, contructorInjectedController.sayHello());
    }
}
