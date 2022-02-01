package com.org.project.coreJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] agrs) {

        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\govar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username:");
        String userName = sc.nextLine();
        driver.findElement(By.id("user-name")).sendKeys(userName);
        System.out.println("username is: "+userName);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        List<WebElement> links = driver.findElements(By.tagName("div"));
        System.out.println("URL's are :" +links.size());
        for (int i=0;i<links.size();i++) {
            System.out.println("Attribute name value of element : "+links.get(i).getAttribute("title"));
            //System.out.println("Text value of element : "+links.get(i).getText()+" index "+i);
        }
        driver.close();*/

        /*int n=7, num1=0, num2=1, i=0;
        System.out.println("Fibonacci Series upto "+n+"numbers is:");
        while (i<=n){
            System.out.print(num1+" , ");
            int sunOfPrevTwo = num1+num2;
            num1=num2;
            num2=sunOfPrevTwo;
            i++;
        }*/
        /*int number = 123456, reverse = 0;

        for(;number !=0;number=number/10)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter age:");
        int age = 20;

        switch (age <= 10){
            case 10 :
        } */


    }
}
