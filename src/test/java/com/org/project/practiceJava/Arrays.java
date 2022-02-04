package com.org.project.practiceJava;

public class Arrays {
    public static void main (String args[]) {
        String names[] = new String[4];
        names[0] = "S Sreekanth Reddy";
        names[1] = "S Navaneethamma";
        names[2] = "S Govardhan Reddy";
        names[3] = "S Dhana Lakshmi";
        String c[]=new String[names.length];

        System.out.println("Length of the Array is:"+names.length);

              String [] copyName=new String[names.length];
        System.arraycopy(names,0,copyName,0,3);
        System.out.println(copyName[2]);


       /* for (int i=0;i<names.length;i++) {
        System.out.println("The name is: "+names[i]);

    }*/
          /*  for (String i : names) {

                System.out.println("The name is:"+i);

        }*/
    }
}
