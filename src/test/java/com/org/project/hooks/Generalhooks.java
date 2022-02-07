package com.org.project.hooks;

import com.org.project.utills.BrowserFactory;
import com.org.project.utills.ConfigFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static com.org.project.base.basePage.quitBrowser;

public class Generalhooks {

    public Generalhooks() {
        ConfigFile.setupConfiguration();

    }

    @After(order = 1)
    public static void closeBrowser() {
        quitBrowser();
    }

    @Before(order = 1)
    public void runBrowser(Scenario scenario) {
        BrowserFactory.initializeDriver();
    }

}
