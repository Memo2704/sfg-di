package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesInjectedControllerTest {

// This is the property way, this is not the way that we want!
    PropertiesInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertiesInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

}