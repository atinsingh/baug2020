package io.pragra.learning.framwork.drivermanager;

import io.pragra.learning.framwork.config.AppConfig;
import io.pragra.learning.framwork.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private WebDriver driver;
    private static DriverManager manager;

    private DriverManager() {

        if ( ((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.CHROME) ) {
            System.setProperty(Constants.CHROME_KEY, (String) AppConfig.getProperties("chrome.driver.location"));
            driver = new ChromeDriver();
            // we can enhance this to add more capalitues
        }else
        if ( ((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.FIREFOX) ){
            System.setProperty(Constants.FIREFOX_KEY, (String) AppConfig.getProperties("firefox.driver.location"));
            driver = new FirefoxDriver();
        } // @Simar to add all browsers
        else {
            System.setProperty(Constants.CHROME_KEY, (String) AppConfig.getProperties("chrome.driver.location"));
            driver = new ChromeDriver();
        }
        // defulat will be chrome
    }

    public static WebDriver getDriver() {
        if(manager == null) {
            manager = new DriverManager();
        }
        return manager.driver;
    }

}
