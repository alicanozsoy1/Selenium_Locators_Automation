package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {
    public static WebDriver driver;
    public static Driver obj;

    private Driver() {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(chromeOptions).create();
    }

    public static WebDriver getDriver() {

        if (driver==null){
            obj=new Driver();
        }

        return driver;
    }
}
