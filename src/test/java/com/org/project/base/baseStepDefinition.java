package com.org.project.base;

import com.org.project.sauce.saucePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class baseStepDefinition {

    WebDriver driver;
    basePage basePage = new basePage(driver);
    saucePage saucePage;

    @Given("Open the browser")
    public void open_the_browser() {

        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        // basePage.start();
    }

    @Given("launch the website {string}")
    public void launch_the_website(String url) throws InterruptedException {
        //  basePage.launchWebSite(string);
        driver.get(url);
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


    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(DataTable testData) {
        List<String> details = testData.asList(String.class);
        saucePage =new saucePage(driver);
        saucePage.enterUser(details.get(0));
        saucePage.enterPassword(details.get(1));
        saucePage.clickLogin();
    }*/


    @And("log in with {string} and {string}")
    public void logInWithAnd(String user, String pwd) {
        saucePage = new saucePage(driver);
        saucePage.enterUser(user);
        saucePage.enterPassword(pwd);
        saucePage.clickLogin();
        System.out.println("Login successfully");
    }

    /*@And("login into application with below details")
    public void loginIntoApplicationWithBelowDetails(String user, String pwd) {
        saucePage = new saucePage(driver);
        saucePage.enterUser(user);
        saucePage.enterPassword(pwd);
        saucePage.clickLogin();
        System.out.println("Login successfully");
    }*/

    @And("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }

    @And("logout from application")
    public void logoutFromApplication() throws InterruptedException {
        saucePage = new saucePage(driver);
        saucePage.clickMenu();
        Thread.sleep(3000);
        saucePage.clickLogout();
        System.out.println("Logout successfully");
    }


    @And("verify {string} error message")
    public void verifyErrorMessage(String expectedError) {
        saucePage = new saucePage(driver);
        Assert.assertEquals(expectedError,saucePage.getErrorMessage());

    }


    @And("add item to cart")
    public void addItemToCart() throws InterruptedException {
        saucePage = new saucePage(driver);
        saucePage.clickaddtocart();
        Thread.sleep(3000);
        System.out.println("item added successfully");

    }

    @And("go to cart")
    public void goToCart() throws InterruptedException {
        saucePage = new saucePage(driver);
        saucePage.clickgotocart();
        Thread.sleep(3000);
       
    }

    @And("verify price on cart")
    public void verifyPriceOnCart(String expectedPrice) {
        saucePage = new saucePage(driver);
        Assert.assertEquals(expectedPrice,saucePage.getitemPrice());
    }


    @And("click on checkout")
    public void clickOnCheckout() {
        saucePage = new saucePage(driver);
        saucePage.clickCheckout();
        
    }

    @And("Pass below data")
    public void passBelowData(String fname, String lname, String pcode) {
        saucePage = new saucePage(driver);
        saucePage.enterFirstname(fname);
        saucePage.enterLastname(lname);
        saucePage.enterPostalcode(pcode);

    }

    @And("click on continue")
    public void clickOnContinue() {
        saucePage = new saucePage(driver);
        saucePage.clickcontinue();
    }

    @And("verify details")
    public void verifyDetails(String expectedPrice) {
        saucePage = new saucePage(driver);
        Assert.assertEquals(expectedPrice,saucePage.getcheckoutPrice());
    }

    @And("click on finish")
    public void clickOnFinish() {
        saucePage = new saucePage(driver);
        saucePage.clickFinish();
    }

    @And("verify success message {string}")
    public void verifySuccessMessage(String expectedMessage) {
        saucePage = new saucePage(driver);
        Assert.assertEquals(expectedMessage,saucePage.getsuccessMessage());

    }
}
