package com.mstow.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C {

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }

}
