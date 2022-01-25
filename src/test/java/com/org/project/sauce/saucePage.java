package com.org.project.sauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

/**
 * Created by rajender.koyyeda on 25-01-2022.
 */
public class saucePage {

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login;


    @FindBy(id = "logout_sidebar_link")
    WebElement logOut;

    @FindBy(id = "react-burger-menu-btn")
    WebElement menu;


    @FindBy(id = "a")
    List<WebElement> mylists;

    WebDriver driver;

    public saucePage(WebDriver driver) {
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 20);
        PageFactory.initElements(factory, this);
    }


    public void enterUser(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        login.click();
    }


    public void clickMenu() {
        menu.click();
    }

    public void clickLogout() {
        logOut.click();
    }
}
