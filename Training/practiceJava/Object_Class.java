package com.org.project.practiceJava;

public class Object_Class {

       public Object_Class(){

        System.out.println(" Default constructor of Object_Class ");
    }
       public Object_Class(String x){

        System.out.println(" Parameter constructor of Object_Class: " +x);
    }

    int a = 1;
    String b = "Govardhan Reddy";
    char c = 'S';

    public void method1() {

        System.out.println(" ClassObject_Class method1 " + a +" "+ b +" "+ c);
    }

    public void method2() {

        System.out.println(" ClassObject_Class method2 " + a +" "+ b +" "+ c);
    }
}
