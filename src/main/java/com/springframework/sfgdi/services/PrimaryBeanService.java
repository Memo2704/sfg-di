package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - from the PRIMARY bean";
    }
}
