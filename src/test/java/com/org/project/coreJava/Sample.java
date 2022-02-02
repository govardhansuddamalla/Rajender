package com.org.project.coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by rajender.koyyeda on 28-01-2022.
 */
public class Sample {
    public static void main(String[] agrs) {

       /* Scanner sc= new Scanner(System.in);
        String age=sc.nextLine();
        System.out.println(" your age is: " +age);*/




        /*int x = 10;
        float y = x;

        float a=10;

        int b= (int) a;

convertion:

        WebDriver driver= new ChromeDriver();

        JavascriptException js= new JavascriptException(driver);

casting:
        Scanner sc= new Scanner(System.in);
        int x= Integer.parseInt(sc.nextLine());

java generics:
        List<WebElement> list=driver.findElements(By.xpath(""));  //multiple

        List<WebElement> list=driver.findElement(By.xpath("")); //single ele


        <T>===type

                public class test(){

            <T> void display(T values){
                s.o.p(values);
            }
            p.s.v.m(string argd[]){
                test object= new test();
                object.display(2);
                        object.display("test");
                        object.display(2.1);
                    }
                }
                */

        // Operators:arthematic/comparision/logical/ternery

        /*int x=111;
        int y=11;
        System.out.println(x);
        System.out.println(y);

String a="raj";
String b="koyyeda";
        System.out.println(a+b +" is bad boy ");

        int z=x<y?x:y;

        System.out.println(z);


        if(x<y){
            z=x;
        }else if(x==y){
            z=y;
        }else if(x!=y){

        }else{

        }

        if(govardha==man){
            if(govardhan==student ){
                if(govardhan.location==vija){

                }
            }
        }

        String x = driver.findElemet(By.xpath("")).getAttribute("color");
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
        }
        */
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
//String x=driver.findElement(By.xpath()).getText();

        // String x="Rajender is boy";
        String y="rajEnder";

        /*System.out.println(x);
        System.out.println(x+y);
        System.out.println(x.trim());
        System.out.println(x.charAt(3));
        System.out.println(x.concat(y));
        System.out.println(x.equals(y));
        System.out.println(x.equalsIgnoreCase(y));
        System.out.println(x.substring(5));
        System.out.println(x.substring(5,7));
        System.out.println(x.replace('e','Z'));


        String x="Rajender is boy";

        String[] x1=x.split("is");


        System.out.println(x1.length);
        System.out.println(x1[0]);
        String[] x2=x.split("\\s+");
        System.out.println(x.length());
        System.out.println(x2.length);  //
        System.out.println(x2[0]);
        System.out.println(x==y);*/


        /*int[] scores = { 215, 234, 218, 189, 221, 290};

        for(int i = 0; i < scores.length; i++)
        {
            int score = scores[i];
            System.out.print(score + "  ");

        }System.out.println();


     //same as above
        for(int a : scores)
        {
            System.out.print(a + "  ");
        }*/






    }
}
