package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static  final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]//select[1]";
    public static  final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]//select[2]";
    public static  final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]//select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_SELECT_YEAR)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(selectCombo);
        selectBoard.selectByIndex(1);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoard1 = new Select(selectCombo1);
        selectBoard1.selectByIndex(5);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoard2 = new Select(selectCombo2);
        selectBoard2.selectByValue("1989");

    }
}
