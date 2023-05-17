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

public class NokiaLumia1020Page extends Utility {

    private static final Logger log = LogManager.getLogger(NokiaLumia1020Page.class.getName());

    public NokiaLumia1020Page() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartTab;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCartButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumiaPriceText;

    public void verifyTheTextNokiaLumia(String expectedMessage){
        Assert.assertEquals(getTextFromElement(nokiaLumiaText),expectedMessage);
    }
public void verifyTheNokiaLumiaPrice349(String expectedMessage){
        Assert.assertEquals(getTextFromElement(nokiaLumiaPriceText),expectedMessage);
}

    //2.8 Change quantity to 2
    public void changeQuantityTo2(String changeQty) {


        qty.clear();
        sendTextToElement(qty, changeQty);
        log.info("Change Quantity to 2 " + qty.toString());
    }


    //2.9 Click on “ADD TO CART” tab
    public void clickAddToCartTab() {

        clickOnElement(addToCartTab);
        log.info("Click on Add to cart tab " + addToCartTab.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedMessage;

public void verifyTheMessageTheProductHasBeenAddedToYourShoppingCart(String expectedMessage){
        Assert.assertEquals(getTextFromElement(productAddedMessage),expectedMessage);
}

    // After that close the bar clicking on the cross button.
    public void afterThatCloseTheBarClickingOnTheCrossButton() {

        clickOnElement(crossButton);
        log.info("Click on cross button on the bar " + crossButton.toString());
    }


    // 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void moseHoverOnShoppingCartAndClickOnGoToCartButton() {


        actionsMethodForMouseHover(shoppingCartButton, goToCartButton);
        log.info("Click on Go TO Cart button " + goToCartButton.toString());
        log.info("Mouse hover on Shopping Cart link " + shoppingCartButton.toString());
    }


}
