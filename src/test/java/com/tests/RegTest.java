package com.tests;

import org.testng.annotations.Test;

public class RegTest extends BaseTest{

    @Test
    public  void Invalid_registration(){

        // gotoopencart = home page
        homePage.
                goToOpenCart().
                goToRegistrationPage().
                reg_IntoOpenCart(
                "km",
                "tarek",
                "km@yahoo.com",
                "8802",
                "123",
                "123");

    }


}
