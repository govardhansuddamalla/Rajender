package com.org.project.base;

import com.org.project.sauce.saucePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class baseStepDefinition {

    WebDriver driver;
    basePage basePage= new basePage(driver);
    saucePage saucePage;

    @Given("Open the browser")
    public void open_the_browser() {

        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
       // basePage.start();
    }
    @Given("launch the website {string}")
    public void launch_the_website(String string) throws InterruptedException {
      //  basePage.launchWebSite(string);
       driver.get(string);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable testData) {

        Map<String, String> data = testData.asMap(String.class, String.class);
        saucePage =new saucePage(driver);
        saucePage.enterUser(data.get("username"));
        saucePage.enterPassword(data.get("password"));
        saucePage.clickLogin();
    }*/


    @And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable testData) {

        List<String> details = testData.asList(String.class);
        saucePage =new saucePage(driver);
        saucePage.enterUser(details.get(0));
        saucePage.enterPassword(details.get(1));
        saucePage.clickLogin();
    }


    @And("log in with {string} and {string}")
    public void logInWithAnd(String user, String pwd) {
        saucePage.enterUser(user);
        saucePage.enterPassword(pwd);
        saucePage.clickLogin();
    }
}
