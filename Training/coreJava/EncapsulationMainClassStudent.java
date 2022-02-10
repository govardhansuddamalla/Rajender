package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */
public class EncapsulationMainClassStudent {
    public static void main(String[] args){
//creating instance of the encapsulated class
        Encapsulation_Student s=new Encapsulation_Student();
//setting value in the name member
        s.setName("Govardhan");
//getting value of the name member
        System.out.println(s.getName());
    }
}
