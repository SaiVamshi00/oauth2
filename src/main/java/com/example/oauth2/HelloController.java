package com.example.oauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/auth")
public class HelloController {

    @GetMapping("/hello")
    public String greet() {
        return "Hello Buddy How are you";
    }

    @GetMapping("/about")
    public String about()
    {
        return "About";
    }
    

}
