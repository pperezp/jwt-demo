package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecuredController {

    @RequestMapping("/hello")
    public String helloWorld(Principal principal) {
        return "Hello world!!";
    }
}
