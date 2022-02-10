package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */
public class Overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {

        System.out.println(Overloading.add(11, 11));
        System.out.println(Overloading.add(11, 11, 11));
    }
}
