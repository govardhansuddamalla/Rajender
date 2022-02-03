package com.org.project.practiceJava;

public class Child extends Parent {

    public Child (){

        System.out.println(" Default constructor of Child ");
    }
    public Child (String y){

        System.out.println(" Parameter constructor of Child: " +y);
    }
    int c = 1;
    String child1 = "Govardhan Reddy";
    String cCity1 = "Kadapa";
    int d = 2;
    String child2 = "Dhana Lakshmi";
    String cCity2 = "Kadapa";

    public void child1 () {
        System.out.println("Child1 details:"+c+" "+child1+" "+cCity1);
    }
    public void child2 () {
        System.out.println("Child2 details:"+d+" "+child2+" "+cCity2);
    }

}
