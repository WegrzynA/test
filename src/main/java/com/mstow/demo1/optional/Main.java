package com.mstow.demo1.optional;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        A a = new A(new B(new C("test")));
        //
        if (a != null) {
            B b = a.getB();
            if (b != null) {
                C c = b.getC();
                if (c != null) {
                    System.out.println(c.getName());
                }
            }
        }
        //
        Optional.of(a)
                .map(A::getB)
                .map(B::getC)
                .map(C::getName)
                .ifPresent(System.out::println);
    }
}

@AllArgsConstructor
@Data
class A {
    B b;
}

@AllArgsConstructor
@Data
class B {
    C c;
}

@AllArgsConstructor
@Data
class C {
    String name;
}
