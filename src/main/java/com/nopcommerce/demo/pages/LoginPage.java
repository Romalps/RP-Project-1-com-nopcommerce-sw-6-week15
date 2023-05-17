package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement checkoutAsGuestLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButtonLink;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement registerTabLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
@CacheLookup
@FindBy(xpath = "//h1[normalize-space()='Register']")
WebElement registerText;
    //2.21Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckoutAsGuestTab() {

        clickOnElement(checkoutAsGuestLink);
        log.info("Click on Checkout As Guest tab " + checkoutAsGuestLink.toString());
    }


    //2.18 Click on “REGISTER” tab
    public void clickOnRegisterTab() {

        clickOnElement(registerTabLink);
        log.info("Click on Register tab " + registerTabLink.toString());
    }
    public void verifyTheTextRegister(String expectedMessage){
        Assert.assertEquals(getTextFromElement(registerText),expectedMessage);
    }

    //Click On Login Link
    public void clickOnLoginLink() {

        clickOnElement(loginLink);
        log.info("Click on Login Link " + loginLink.toString());
    }

    // Enter Email field element and send element
    public void enterEmailField() {
        sendTextToElement(emailField, "prime8912@gmail.com");
        log.info("Enter Email " + emailField.toString());
    }


    // Enter Password field element and send element
    public void enterPasswordFiled() {
        sendTextToElement(passwordField, "Prime8912");
        log.info("Enter password " + passwordField.toString());
    }

    // Click on login button link

    public void clickOnLoginButtonLink() {

        clickOnElement(loginButtonLink);
        log.info("Click on Login Button " + loginButtonLink.toString());
    }


}
