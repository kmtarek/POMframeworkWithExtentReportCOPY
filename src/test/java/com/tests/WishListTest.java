package com.tests;

import org.testng.annotations.Test;

public class WishListTest extends BaseTest {


    @Test
    public void makeWishList(){

        homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("kmtarekfca@yahoo.com", "admin");
        homePage.gotoWishListPage().prepareWishList().verifyWishList();

    }


}
