package com.pages;
//user name : kmtarek_4mLpQK
//access key : sWbGegEQbmc2q6JmdCVs

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

// create constructor for basepage

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    // click method
    public void click(By by) {
        waitVisibility(by).click();
    }

// write text method
    public void writeText(By by, String text) {
        waitVisibility(by).sendKeys(text);
    }

    //wait
    public WebElement waitVisibility(By by) {
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // read text
    public String readText(By by) {
       return waitVisibility(by).getText();
    }

}
