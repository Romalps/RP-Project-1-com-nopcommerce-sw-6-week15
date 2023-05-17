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

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement qtyLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCartLink;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement termsOfServiceCheckboxLink;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agreeTermsOfServiceCheckbox;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement nokiaLumiaCheckoutButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement checkboxOnShoppingCartPage;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButtonOnShoppingCartPage;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalText;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "//input[@id='itemquantity11231']")
    WebElement quantitytext;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement totalAmountText;
//    @CacheLookup
//    @FindBy()
//    WebElement
    public void verifyTheMessageShoppingCart(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(shoppingCartMessage), expectedMessage);
    }

    public void changeTheQtyTo2(String qty) {

        // 2.16 Change the Qty to "2"
        qtyLink.clear();
        sendTextToElement(qtyLink, qty);
        log.info("Change the Quantity to 2 " + qtyLink.toString());
    }

    // Click on "Update shopping cart"
    public void updateTheShoppingCartAfterChangingQty() {

        clickOnElement(updateShoppingCartLink);
        log.info("Click on Update Shopping Cart button " + updateShoppingCartLink.toString());
    }

    public void verifyTheTotal2950(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(totalText), expectedMessage);
    }


    // 2.18 click on checkbox “I agree with the terms of service”
    public void clickTermsOfServiceCheckbox() {

        clickOnElement(termsOfServiceCheckboxLink);
        log.info("Click on I agree with the terms of service checkbox " + termsOfServiceCheckboxLink.toString());
    }


    //2.19 Click on “CHECKOUT”
    public void clickOnCheckoutButton() {

        clickOnElement(checkOutLink);
        log.info("Click on checkout button " + checkOutLink.toString());
    }

    public void verifyTheTextWelcomePleaseSignIn(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(welcomeText), expectedMessage);
    }

    //************************************************


    public void verifyTheQuantity(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(quantitytext), expectedMessage);
    }
public void verifyTheTotal698(String expectedMessage){
        Assert.assertEquals(getTextFromElement(totalAmountText),expectedMessage);
}

    //2.15 click on checkbox “I agree with the terms of service”
    public void clickOnCheckboxIAgreeWithTheTermsOfService() {

        clickOnElement(agreeTermsOfServiceCheckbox);
        log.info("Click on I agree with the terms of service checkbox " + agreeTermsOfServiceCheckbox.toString());
    }


    //2.16 Click on “CHECKOUT”
    public void clickOnCheckoutButtonAfterAddingNokiaLumia() {

        clickOnElement(nokiaLumiaCheckoutButton);
        log.info("Click on Checkout button " + nokiaLumiaCheckoutButton.toString());
    }


    //2.25 click on checkbox “I agree with the terms of service”
    public void clickOnTermsOfServiceCheckboxOnShoppingCartPage() {

        clickOnElement(checkboxOnShoppingCartPage);
        log.info("Click on I agree with the terms of service checkbox " + checkboxOnShoppingCartPage.toString());
    }


    //2.26 Click on “CHECKOUT”
    public void clickCheckoutOnShoppingCartPage() {

        clickOnElement(checkoutButtonOnShoppingCartPage);
        log.info("Click on Checkout button " + checkoutButtonOnShoppingCartPage.toString());
    }


}
