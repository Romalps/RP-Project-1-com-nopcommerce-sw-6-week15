package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram8GB;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hDD400GBRadioButton;
    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement oSVistaPremiumRadioButton;
    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareCheckboxesForMSOffice;
    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCheckboxesForCommander;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartBtn;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossButtonLink;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;
    @CacheLookup
    @FindBy(className = "content")
    WebElement productAddedMessage;

    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCartLink = By.xpath("//button[normalize-space()='Go to cart']");

    public void verifyTheTextBuildYourOwnComputer(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(buildYourOwnComputerText), expectedMessage);
    }

    public void select2_2GHxIntelPentiumDualCoreE2200(String text) {
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        selectByVisibleTextFromDropDown(processor, text);
        log.info("Build your own Computer with processor " + processor.toString());
    }

    public void select8GBRam(String text) {
        // 2.7.Select "8GB [+$60.00]" using Select class.
        selectByVisibleTextFromDropDown(ram8GB, text);
        log.info("Build your own Computer with 8GB RAM " + ram8GB.toString());
    }

    public void selectHDDRadio400GB() {
        // 2.8 Select HDD radio "400 GB [+$100.00]"
        clickOnElement(hDD400GBRadioButton);
        log.info("Build your own Computer with 400GB HDD " + hDD400GBRadioButton.toString());
    }

    public void selectOSRadioVistaPremium() {
        // 2.9 Select OS radio "Vista Premium [+$60.00]"
        clickOnElement(oSVistaPremiumRadioButton);
        log.info("Build your own Computer with OS Vista Premium " + oSVistaPremiumRadioButton.toString());
    }

    public void checkTwoBoxesMicrosoftOfficeAndTotalCommander() {
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        clickOnElement(softwareCheckboxesForCommander);
        log.info("Build your own Computer with Microsoft Office and Total Commander " + softwareCheckboxesForCommander.toString());
    }

    public void verifyThePrice1475(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(priceText), expectedMessage);
    }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCartButton() {

        log.info("Click on Add to Cart Button " + addToCartBtn.toString());
        clickOnElement(addToCartBtn);

    }

    public void verifyTheMessageTheProductHasBeenAddedTOYourShoppingCart(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(productAddedMessage), expectedMessage);
    }

    // After that close the bar clicking on the cross button.
    public void closeTheBarClickingOnTheCrossButton() {

        clickOnElement(crossButtonLink);
        log.info("Close the bar by clicking on the cross button " + crossButtonLink.toString());
    }


    // 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCartAndClickOnGoTOCartButton() {

        try {
            Actions actions = new Actions(driver);
            WebElement shoppingCartElement = waitUntilVisibilityOfElementLocated(shoppingCart, 10);
            actions.moveToElement(shoppingCartElement).perform();
            WebElement goToCartButton = waitUntilElementToBeClickable(goToCartLink, 10);
            goToCartButton.click();
        } catch (ElementNotInteractableException e) {
            // Handle the exception
        }

    }

}
