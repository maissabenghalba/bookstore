package com.maissabg.book.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @GetMapping
    public String hello() {
        return "Hello from spring & keycloak";
    }
    @GetMapping ("/hello-2")
    public String hello2() {
        return "Hello from spring & keycloak - ADMIN";
    }
}
