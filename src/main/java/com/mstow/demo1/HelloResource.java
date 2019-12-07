package com.mstow.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    private final B b;

    public HelloResource(B b) {
        this.b = b;
    }

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return b.welcome();
    }

}
