package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */
public class Constructor_Class {


    public Constructor_Class(String y){
        System.out.println(" Parameter constructor of ClassObject_Class " +y);
    }
    public Constructor_Class(){
        System.out.println(" Default constructor of ClassObject_Class ");
    }
    int a = 10;
    String b = "test";
    char c = 'Z';

    public void method1() {

        System.out.println(" ClassObject_Class method1 " + a + b + c);
    }

    public void method2() {

        System.out.println(" ClassObject_Class method2 " + a + b + c);
    }
}


