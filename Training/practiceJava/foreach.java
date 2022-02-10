package com.org.project.practiceJava;

public class foreach {

    public static void main (String args[]){
        char[] alpbhts = { 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        System.out.println(alpbhts.length);

        for(char i = 0; i < alpbhts.length; i++)
        {
            char alpbht = alpbhts[i];
           // int score = scores[i];
            System.out.print(alpbht + " ");

        }
         System.out.println();
         for(char alphbt : alpbhts)
         {
            System.out.print(alphbt + " ");
         }
    }
}
