package com.org.project.practiceJava;

public class Method_Over_Riding {


        void run() {
            System.out.println ("Instructor is teaching the lesson");
        }

    }

    class student extends Method_Over_Riding {
        void run() {

            System.out.println ("Student is lisening the lesson which is teaching by Instructor ");
        }
        public static void main(String [] args) {
            Method_Over_Riding a = new student();
            a.run();

        }
    }



