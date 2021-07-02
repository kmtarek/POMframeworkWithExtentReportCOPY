package com.pages;

import com.utils.Logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static org.testng.AssertJUnit.assertEquals;

public class WishListPage extends BasePage{

    public WishListPage(WebDriver driver){

        super(driver);
    }
    //By wishlistCSS = By.cssSelector("div.container:nth-child(4) div.row aside.col-sm-3.hidden-xs div.list-group > a.list-group-item:nth-child(5)");
    By desktopLT = By.linkText("Desktops");
    By macLT = By.linkText("Mac (1)");
    By addMACxp = By.xpath("//span[contains(text(),'Add to Cart')]");
    By successList = By.xpath("//*[@id=\"product-category\"]/div[1]");


    public WishListPage prepareWishList(){

        click(desktopLT);
        click(macLT);
        click(addMACxp);
        return this;
    }

    public WishListPage verifyWishList(){
        Log.info("verifying Wish List");
        waitVisibility(successList).isDisplayed();
        //assertEquals(readText(successList),exp_txt);
        return this;
    }
}
