package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    //public final static String FIREFOX = "FIREFOX_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver (final String driver) {
        System.setProperty("webdriver.chrome.driver","c:\\Selenium-drivers\\Chrome\\Chrome1\\chromedriver.exe");
        return new ChromeDriver();
    }
}
