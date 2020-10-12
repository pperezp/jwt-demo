package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecuredController {

    @GetMapping("/user")
    public ResponseEntity<Principal> userEndpoint(Principal principal) {
        return ResponseEntity.ok(principal);
    }

    @GetMapping("/admin")
    public ResponseEntity<Principal> adminUser(Principal principal) {
        return ResponseEntity.ok(principal);
    }
}
