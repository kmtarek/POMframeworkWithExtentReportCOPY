package com.tests;

import com.pages.HomePage;
import com.utils.Logs.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {

    public WebDriver driver;

    public HomePage homePage;

    public WebDriver getDriver(){

        return driver;
    }

    @BeforeClass
    public void classLevelSetUP(){
        Log.info("test is starting ....");
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void testPrint(){

        String title = driver.getTitle();
        System.out.println("Page Tile : "+title);

    }

    @BeforeMethod
    public void methodLevelSetUP(){

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        Log.info("test ended...");
        driver.close();
    }

}
