package com.obl.wehelp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl {
    public String getGreeting() {
        return "Hello, WeHelp!";
    }
}
