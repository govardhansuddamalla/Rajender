package com.org.project.coreJava;

import org.openqa.selenium.By;

/**
 * Created by rajender.koyyeda on 10-02-2022.
 */
public class Condition_loops {
    public static void main(String[] agrs) {

       /*String x = driver.findElemet(By.xpath("")).getAttribute("color");
        switch (x) {
            case "red":
                s.o.p("failed");

                break;
            case "green":
                s.o.p("pass");
                break;
            case "yellow":
                s.o.p("inprogress");
                break;
            default:
                s.o.p("no color matched");
        }*/

        //Loops

        /*you are in 0 with aged: 0 total age is 5
        you are in 1 with aged: 1 total age is 5
        you are in 2 with aged: 3 total age is 5
        you are in 3 with aged: 6 total age is 5
        you are in 4 with aged: 10 total age is 5
        you are in 5 with aged: 15 total age is 5*/



       /*int aged=0;
      for(int age=5;age>=1;age--){
          aged=0;
          aged=aged+age;
          System.out.println("you are in "+age+" with aged: "+aged +" total age is "+age1);

      }*/
        /*while(age1==3){
            System.out.println("you are loop");
            age1++;
        }System.out.println("you are not loop");*/

        /*int age1=4;

        do {
            System.out.println("you are in do " +age1);
            age1++;
        }
        while(age1<6);
            System.out.println("you are loop");*/

        //same as above
        int scores[] = {1,2,3,4};
        for(int a : scores)
        {
            System.out.print(a + "  ");
        }
    }
}
