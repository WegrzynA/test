package com.mstow.demo1;

import org.springframework.stereotype.Component;

@Component
public class B {
    private final A a;

    public B(A a) {
        this.a = a;
    }

    String welcome() {
        return "Welcome from B";
    }
}
