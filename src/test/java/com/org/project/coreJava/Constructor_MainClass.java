package com.org.project.coreJava;

public class Constructor_MainClass {
    public static void main(String args[]) {

        Constructor_Class1 classObject_class1 = new Constructor_Class1("raj");

        ConstructionInterface construction = new ConstructionInterface();

        /*System.out.println(classObject_class1.a);
        System.out.println(classObject_class1.b);
        System.out.println(classObject_class1.c);
        classObject_class1.method1();
        classObject_class1.method2();
        System.out.println(classObject_class1.aa);
        System.out.println(classObject_class1.bb);
        System.out.println(classObject_class1.cc);
        classObject_class1.method11();
        classObject_class1.method22();*/

        construction.baseMent();
        construction.pillors();
        construction.slab();
        construction.walls();

    }

}
