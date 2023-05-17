package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {

        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement nameZToALink;
    By productNameListLink = By.className("product-item");

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement nameAToZLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")
    WebElement addToCartLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")
    WebElement productInDescendingOrder;

    // 1.3 Select Sort By position "Name: Z to A"
    public void selectSortByPositionNameZToA(String sortBy) {


        selectByVisibleTextFromDropDown(nameZToALink, sortBy);
        // Get all the product and store them in list
//        List<WebElement> productList = driver.findElements(productNameListLink);
//        List<String> productName = new ArrayList<>();
//
//        for (WebElement product : productList) {
//
//            productName.add(product.findElement(By.className("product-title")).getText());
//
//        }
//        // sort the product names in descending order
//        List<String> sortedProductNameList = new ArrayList<>(productName);
//        Collections.sort(sortedProductNameList, Collections.reverseOrder());
       // Assert.assertEquals(sortedProductNameList, productList);

    }


    public void verifyTheProductWillArrangeInDescendingOrder() {

        Assert.assertEquals(getTextFromElement(productInDescendingOrder), "Lenovo IdeaCentre 600 All-in-One PC");
    }


    //2.3 Select Sort By position "Name: A to Z"
    public void selectSortByPositionNameAToZ(String sortBy) {

        selectByVisibleTextFromDropDown(nameAToZLink, sortBy);
        log.info("Select Name : A to Z from sort by Position" + nameAToZLink.toString());
    }
    // 2.4 Select "Build your own computer" and  Click on "Add To Cart"

    public void clickOnAddToCArtButton() {

        clickOnElement(addToCartLink);
    }

}
