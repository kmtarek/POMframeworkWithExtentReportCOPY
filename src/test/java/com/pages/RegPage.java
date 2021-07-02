package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegPage extends BasePage{

    public RegPage(WebDriver driver){

        super(driver);
    }

    By f_name = By.xpath("//input[@id='input-firstname']");
    By l_name = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By tel = By.xpath("//input[@id='input-telephone']");
    By pw = By.xpath("//input[@id='input-password']");
    By con_pw = By.xpath("//input[@id='input-confirm']");
    By chk_box= By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)");
    By continued= By.cssSelector("#content > form > div > div > input.btn.btn-primary");

    WebElement radioButton = driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]"));

    public  RegPage reg_IntoOpenCart(String fnmae, String lname, String e_mail, String telN, String pwN, String con_pwN){

        writeText(f_name, fnmae);
        writeText(l_name, lname);
        writeText(email, e_mail);
        writeText(tel, telN);
        writeText(pw, pwN);
        writeText(con_pw, con_pwN);

        if(radioButton.isSelected()){
            System.out.println("subscription not selected");

        }

        click(chk_box);
        click(continued);

        return this;

    }



}
