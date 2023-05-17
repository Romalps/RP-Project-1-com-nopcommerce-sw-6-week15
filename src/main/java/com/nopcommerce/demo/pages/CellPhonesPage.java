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

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement productNokiaLumiaLink;
@CacheLookup
@FindBy(xpath = "//h1[normalize-space()='Cell phones']")
WebElement cellPhonesText;

    public void verifyTheTextCellPhones(String expectedMessage){
        Assert.assertEquals(getTextFromElement(cellPhonesText),expectedMessage);
    }


    // 2.4 Click on List View Tab
    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
        log.info("Click on List view tab" + listViewTab.toString());
    }


    public void clickOnProductNameNokiaLumiaLink() {


        clickOnElement(productNokiaLumiaLink);
        log.info("Click on product name Nokia Lumia link " + productNokiaLumiaLink.toString());
    }


}
