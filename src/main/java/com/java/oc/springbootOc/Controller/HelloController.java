package com.java.oc.springbootOc.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "Received:>>> " + message;
    }
}