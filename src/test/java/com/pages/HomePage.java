package com.pages;

import com.utils.Logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class HomePage extends BasePage{

    public  HomePage(WebDriver driver){

        super(driver);
    }

    String baseURL = "https://demo.opencart.com/";

public  HomePage goToOpenCart(){

    Log.info("go to opencart home page");
    driver.get(baseURL);
    return this;
}
    public HomePage verifyHomePage(String exp_URL){

        Log.info(" verifying homepage-current url ");
        String act_url = driver.getCurrentUrl();
        assertEquals(act_url, exp_URL);
        return this;

    }
public LoginPage goToLoginPage(){
    Log.info("go to login page ");
    driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

    return new LoginPage(driver);

}
    public RegPage goToRegistrationPage() {
        Log.info("go to registration page");
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

        return new RegPage(driver);

    }

    public WishListPage gotoWishListPage(){

        Log.info("go to Wish List page");

        // first go to login page with valid credentials then click Wish List
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row aside.col-sm-3.hidden-xs div.list-group > a.list-group-item:nth-child(5)")).click();
        return new WishListPage(driver);
    }

    public RewardPage gotoRewardPage(){

        Log.info("go to reward page");

        // first go to login page with valid credentials then click Reward Page
        driver.findElement(By.cssSelector("div.container:nth-child(4) div.row aside.col-sm-3.hidden-xs div.list-group > a.list-group-item:nth-child(9)")).click();
        return new RewardPage(driver);
    }

}
