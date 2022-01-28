package com.org.project.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by rajender.koyyeda on 25-01-2022.
 */
public class basePage {

   WebDriver driver ;

    public basePage(WebDriver driver1) {
        this.driver = driver1;
       // AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
        PageFactory.initElements(driver,this);
    }

    public void start() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public void launchWebSite(String url) {
        driver.get(url);
        driver.manage().window().maximize();

    }

    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
