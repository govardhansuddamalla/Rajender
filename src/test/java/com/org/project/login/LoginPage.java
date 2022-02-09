package com.org.project.login;

import com.org.project.base.basePage;
import com.org.project.utills.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by rajender.koyyeda on 25-01-2022.
 */
public class LoginPage extends basePage {


    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement login;

    public void fill_email_field(String user) {
        username.clear();
        username.click();
        username.sendKeys(user);
    }

    public void fill_password_field(String pwd) {
        password.clear();
        password.click();
        password.sendKeys(pwd);
    }

    public void clickOnLoginButton() {
        login.click();
        log().info("clicked on login button");
    }


}
