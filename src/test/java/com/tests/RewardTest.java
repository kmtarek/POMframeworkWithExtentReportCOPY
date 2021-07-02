package com.tests;

import org.testng.annotations.Test;

public class RewardTest extends BaseTest{


    @Test
    public void checkReward(){

    homePage.goToOpenCart().goToLoginPage().logIntoOpenCart("kmtarekfca@yahoo.com", "admin");
    homePage.gotoRewardPage().seeRewardAndExit().verifyReward("Your Reward Points");

}


}
