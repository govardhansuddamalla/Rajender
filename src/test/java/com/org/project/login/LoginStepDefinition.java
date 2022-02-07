package com.org.project.login;


import com.org.project.base.basePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.org.project.utills.ConfigFile.password;
import static com.org.project.utills.ConfigFile.userName;

public class LoginStepDefinition extends basePage {


    LoginPage loginPage = new LoginPage();


    @Given("loginToApplication")
    public void logintoapplication() {
        openBrowser();
        loginPage.fill_email_field(userName);
        loginPage.fill_password_field(password);
        loginPage.clickOnLoginButton();
    }
}

