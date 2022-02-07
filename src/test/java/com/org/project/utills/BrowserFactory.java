package com.org.project.utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.org.project.utills.ConfigFile.*;

public class BrowserFactory {

    private static ThreadLocal<BrowserFactory> browserFactoryThread = new ThreadLocal<BrowserFactory>();
    private static ThreadLocal<WebDriver> driverThread = new ThreadLocal<WebDriver>();

    private BrowserFactory() {

    }

    public static BrowserFactory initializeDriver() {
        if (browserFactoryThread.get() == null) {
            browserFactoryThread.set(new BrowserFactory());
            setChromeDriver(System.getProperty("os.name"));
            setDriver();
        }
        return browserFactoryThread.get();
    }

    private static void setDriver() {
        switch (browserName) {
            case "firefox":
                break;
            case "IE":
                break;
            default:
                setChromeDriver(System.getProperty("os.name"));
                driverThread.set(new ChromeDriver(setChromeOptions()));
        }
    }

    public static void setChromeDriver(String osName) {
        String driverName = null;
        String driverPath;
        switch (osName) {
            case "Linux":
                driverName = "chromedriver";
                break;
            case "Mac":
                break;
            default:
                driverName = "chromedriver.exe";
        }
        driverPath = projectDirectory + "/src/test/resources/drivers/" + driverName;
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    public static ChromeOptions setChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeOptions.addArguments("--enable-automation");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.setHeadless(Boolean.parseBoolean(headless));
        return chromeOptions;
    }

    public WebDriver getDriver() {
        return driverThread.get();
    }

    public void closeDriverSession() {
        driverThread.get().close();
        browserFactoryThread.remove();
        driverThread.remove();
    }
}
