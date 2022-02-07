package com.org.project.utills;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {

    public static WebDriver getBrowser() {
        return BrowserFactory.initializeDriver().getDriver();
    }

    public static void closeBrowser() {
        BrowserFactory.initializeDriver().closeDriverSession();
        ;
    }

    public static JavascriptExecutor getJsExecutor() {
        return (JavascriptExecutor) getBrowser();
    }

    public static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getBrowser(), Duration.ofSeconds(60));
    }

}
