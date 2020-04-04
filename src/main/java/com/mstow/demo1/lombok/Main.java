package com.mstow.demo1.lombok;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wpisz A");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Wpisz B");
        int b = in.nextInt();
        System.out.println("Wpisz c");
        int c = in.nextInt();
        double wynik = a + b / c;
        System.out.println("A * B*c = "  + wynik);
    }
}
