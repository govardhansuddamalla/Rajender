package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 02-02-2022.
 */


    class Bike{
        void run(){System.out.println("running");}
    }
    class Splendor extends Bike{
        void run(){System.out.println("running safely with 60km");}

        public static void main(String args[]){
            Bike b = new Splendor();//upcasting
            b.run();
        }
    }

