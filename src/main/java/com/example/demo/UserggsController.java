package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userggs")
public class UserggsController {
    @GetMapping
    public String users() {
        return "Hello Users";
    }
}

