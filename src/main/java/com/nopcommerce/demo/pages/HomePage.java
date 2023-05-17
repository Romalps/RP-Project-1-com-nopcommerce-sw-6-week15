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

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerMenuLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTabLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhonesLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;


    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
        log.info("Select menu option " + menu.toString());
    }

    // 1.1 Click on Computer Menu.
    public void clickOnComputerMenu() {

        log.info("Click on Computer Menu tab " + computerMenuLink.toString());
        clickOnElement(computerMenuLink);
    }


    //1.2 Click on Desktop
    public void clickOnDesktopFromComputerMenuTab() {

        clickOnElement(desktopLink);
        log.info("Click on Logout LinkDesktop tab " + desktopLink.toString());
    }


    public void mouseHoverOnElectronicsTab() {
        //1.1 Mouse Hover on “Electronics” Tab
        //1.2 Mouse Hover on “Cell phones” and click
        actionsMethodForMouseHover(electronicsTabLink, cellPhonesLink);
        log.info("Mouse hover on Electronics tab " + electronicsTabLink.toString());
        log.info("Mouse hover on Cell phones and click " + cellPhonesLink.toString());
    }


    //2.43 Click on “Logout” link
    public void clickOnLogoutLink() {

        log.info("Click on Logout Link " + logOutLink.toString());

        clickOnElement(logOutLink);
    }
public void verifyTheNopCommerceURL(String expectedMessage){
        String url = driver.getCurrentUrl();
    Assert.assertEquals(url,expectedMessage);
}

}
