package com.mstow.demo1;

import org.springframework.stereotype.Component;

@Component
public class A {
    {
        System.out.println("A is loaded!");
    }

    public A() {
        System.out.println("A is loaded - constructor!");
    }
}
