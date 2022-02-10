package com.org.project.practiceJava;

public class Parent {

    public Parent (){

        System.out.println(" Default constructor of Parent ");
    }
    public Parent (String x){

        System.out.println(" Parameter constructor of Parent: " +x);
    }

    int a = 1;
    String father = "Sreekanth Reddy";
    String fCity = "Kadapa";
     int b = 2;
     String mother = "Navaneethamma";
     String mCity = "Kadapa";

    public void father () {
        System.out.println("Father details:"+a+" "+father+" "+fCity);
    }
    public void mother () {
        System.out.println("Father details:"+b+" "+mother+" "+mCity);
    }

}
