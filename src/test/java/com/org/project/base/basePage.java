package com.org.project.base;

import com.org.project.utills.Browser;
import com.org.project.utills.ConfigFile;
import com.org.project.utills.LogConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static com.org.project.utills.ConfigFile.propertiesAsMap;

/**
 * Created by rajender.koyyeda on 25-01-2022.
 */
public class basePage extends Browser implements LogConfiguration {

   WebDriver driver ;

    public basePage() {
        PageFactory.initElements(new AjaxElementLocatorFactory(getBrowser(), 30), this);
    }

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

      public static void quitBrowser() {
        closeBrowser();
    }

    public void openBrowser() {
        delete_all_cookies();
        getBrowser().get(ConfigFile.applicationUrl);
        log().info("app url launched");System.out.println("app url launched--sop");
    }

    public static void delete_all_cookies() {
        getBrowser().manage().deleteAllCookies();
    }


}
