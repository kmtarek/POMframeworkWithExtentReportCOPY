package com.tests;

import static com.utils.ExtentReports.ExtentTestManager.startTest;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class LoginTest extends BaseTest{

    @Test(priority = 0)
    public void invalid_emailAndPassword_LoginTest1(Method method){
        startTest(method.getName(), "invalid credintials");
        homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("km111@yahoo.com", "dhaka").verify_InvalidLogin("Warning: No match for E-Mail Address and/or Password.");

    }

    @Test(priority = 1)
    public void invalid_emailAndPassword_LoginTest2(Method method){
        startTest(method.getName(), "invalid credintials");
        homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("km1234@gmail.com", "khulna").verify_InvalidLogin("Warning: No match for E-Mail Address and/or Password.");

    }

    @Test(priority = 2)
    public void invalid_emailAndPassword_LoginTest3(Method method){
        startTest(method.getName(), "invalid credintials");
        homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("kmtarek123@gmail.com", "bogura").verify_InvalidLogin("Warning: No match for E-Mail Address and/or Password.");

    }
    @Test(priority = 3)
    public void valid_emailAndPassword_LoginTest(Method method){
        startTest(method.getName(), "valid credintials");
        homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("kmtarekfca@yahoo.com", "admin").verify_ValidLogin("Edit Account");

    }

}
