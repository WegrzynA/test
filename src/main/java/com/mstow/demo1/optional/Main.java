package com.mstow.demo1.optional;

import io.vavr.control.Option;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        A a = new A(new B(new C("test")));
        A a = new A(new B(null));
        //
        if (a != null) {
            B b = a.getB();
            if (b != null) {
                C c = b.getC();
                if (c != null) {
                    System.out.println(c.getName());
                } else {
                    System.out.println("c is null");
                }
            }
        }
        // optional
        Optional.of(a)
                .map(orElse(A::getB, () -> System.out.println("b is null")))
                .map(orElse(B::getC, () -> System.out.println("c is null")))
                .map(C::getName)
                .ifPresent(System.out::println);

        // vavr
        Option.of(a)
                .map(A::getB)
                .map(B::getC)
                .onEmpty(() -> System.out.println("c is null"))
//                .map(C::getName)
                .peek(System.out::println);
    }

    private static <T,U> Function<T,U> orElse(Function<? super T, ? extends U> mapper, Runnable runnableOnNull) {
        return input -> {
            U u = mapper.apply(input);
            if (u == null) {
                runnableOnNull.run();
            }
            return u;
        };
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
