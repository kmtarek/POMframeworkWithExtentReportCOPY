package com.pages;

import com.utils.Logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class RewardPage extends BasePage{

    public RewardPage(WebDriver driver){

        super(driver);

    }

    By cont = By.xpath("//a[contains(text(),'Continue')]");
    By rPoint = By.xpath("//h1[contains(text(),'Your Reward Points')]");

    public RewardPage seeRewardAndExit(){
        //click(cont);
        return this;
    }

    public RewardPage verifyReward(String exp_txt){
        Log.info("verifying reward points");
        waitVisibility(rPoint);
        assertEquals(readText(rPoint),exp_txt);
        return this;

    }

}
