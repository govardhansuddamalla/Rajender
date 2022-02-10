package com.org.project.practiceJava;

public class ArrayException {
    public static void main(String args[]) {

        try {
            int dob[] = {1, 4, 9, 3};
            System.out.println(dob[3]);
            System.out.println(dob[4]);
        } catch (Exception es) {
            System.out.println("*****failed because of array size is exceeded*******");
            es.printStackTrace();

        } finally {
            System.out.println("My Name is Govardhan Reddy");
        }
        System.out.println("My Home Town is Kadapa");
    }

}
