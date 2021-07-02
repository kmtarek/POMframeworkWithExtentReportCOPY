package com.pages;

import com.utils.Logs.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.AssertJUnit.assertEquals;

public class LoginPage extends BasePage {

    public  LoginPage(WebDriver driver){

        super(driver);
    }

    By emailID = By.id("input-email");

    By passworgID = By.id("input-password");

    By loginXP = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");

    By errorMsg = By.xpath("//*[@id=\"account-login\"]/div[1]");

    By validLogin = By.xpath("//a[contains(text(),'Edit Account')]");


    public  LoginPage logIntoOpenCart(String email, String password){

        Log.info("trying to log-in");
        writeText(emailID,email );
        writeText(passworgID, password);
        click(loginXP);
        return this;

    }

    public LoginPage verify_InvalidLogin(String exp_txt){

        Log.info("verifying login");
        waitVisibility(errorMsg);
        assertEquals(readText(errorMsg),exp_txt);
        return this;

    }

    public LoginPage verify_ValidLogin(String exp_txt){

        Log.info("verifying login");
        waitVisibility(validLogin);
        assertEquals(readText(validLogin),exp_txt);
        return this;

    }




}
