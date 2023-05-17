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

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueTabOnRegisterPage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;

    //2.20 Fill the mandatory fields
    public void fillTheMandatoryFieldsForRegistration() {

        // Find First name field element and send element
        sendTextToElement(firstName, "Prime" + getRandomString(4));
        log.info("Enter First name " + firstName.toString());
        // Find Last name field element and send element
        sendTextToElement(lastName, "Tester" + getRandomString(4));
        log.info("Enter Last name " + lastName.toString());
        // Find Email field element and send element
        sendTextToElement(email, "primetester" + getRandomString(4) + "@gmail.com");
        log.info("Enter Email " + email.toString());
        // Find Password field element and send element
        sendTextToElement(password, "Prime54tester32");
        log.info("Enter password " + password.toString());
        // Find Confirm Password field element and send element
        sendTextToElement(confirmPassword, "Prime54tester32");
        log.info("Enter Confirm password " + confirmPassword.toString());
    }

    //2.21 Click on “REGISTER” Button
    public void clickOnRegisterButton() {

        clickOnElement(registerButton);
        log.info("Click on Register button " + registerButton.toString());
    }

    public void verifyTheMessageYourRegistrationCompleted(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(registrationCompletedMessage), expectedMessage);
    }

    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueTabOnRegisterPage() {

        clickOnElement(continueTabOnRegisterPage);
        log.info("Click on Continue tab " + continueTabOnRegisterPage.toString());
    }


}
