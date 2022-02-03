package com.org.project.practiceJava;

public class Parent_child_Main {

    public static void main (String args[]){
        Child child = new Child("Siva Reddy");
        System.out.println(child.a);
        System.out.println(child.father);
        System.out.println(child.fCity);
        child.father();
        System.out.println(child.b);
        System.out.println(child.mother);
        System.out.println(child.mCity);
        child.mother();
        System.out.println(child.c);
        System.out.println(child.child1);
        System.out.println(child.cCity1);
        child.child1();
        System.out.println(child.d);
        System.out.println(child.child2);
        System.out.println(child.cCity2);
        child.child2();
    }
}
