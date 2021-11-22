package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class PropertiesInjectedControllerTest {

// This is the property way, this is not the way that we want!
    PropertiesInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertiesInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}