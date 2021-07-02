package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void testHomePage(){

        homePage.goToOpenCart().verifyHomePage("https://demo.opencart.com/");

    }

}
