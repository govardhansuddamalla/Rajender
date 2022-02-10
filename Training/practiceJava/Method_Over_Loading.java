package com.org.project.practiceJava;

public class Method_Over_Loading {
    static String add(String a, String b) {
        return a+b;
    }
    static String add (String a, String b, String c) {
        return a+b+c;
    }
            public static void main (String [] args) {
            System.out.println(Method_Over_Loading.add("Govardhan","Reddy"));
            System.out.println(Method_Over_Loading.add("Govardhan","Reddy","S"));

        }
    }

