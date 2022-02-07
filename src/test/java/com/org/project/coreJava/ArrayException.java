package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 04-02-2022.
 */
public class ArrayException {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        try{
            int a[]={9,8,7};
            System.out.println(a[3]/0);
            System.out.println("Success:: My name is GOVARDHAN");
        }catch (Exception es){
            System.out.println("failed :: array calling with size");
           es.printStackTrace();
         //  es.getMessage();
        }finally {
            System.out.println("Na chav nanu chastha");
        }

        System.out.println("My name is rajender");
    }
}
