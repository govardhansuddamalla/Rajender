package com.org.project.practiceJava;

public class Object_Class1 extends Object_Class {
    public Object_Class1(){

        System.out.println(" Default constructor of Object_Class ");
    }
    public Object_Class1(String y){

        System.out.println(" Parameter constructor of Object_Class1: " +y);
    }
    int d = 2;
    String e = "Suddamalla";
    char f = 'S';

    public void method3() {

        System.out.println(" ClassObject_Class method3 " + d +" "+ e +" "+ f);
    }

    public void method4() {

        System.out.println(" ClassObject_Class method4 " + d +" "+ e +" "+ f);
    }
}
