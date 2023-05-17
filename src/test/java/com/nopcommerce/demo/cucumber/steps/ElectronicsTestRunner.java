package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.testng.Assert;

public class ElectronicsTestRunner {
    @When("^mouse hover on Electronics tab and mouse hover on CellPhones and click$")
    public void mouseHoverOnElectronicsTabAndMouseHoverOnCellPhonesAndClick() {
        new HomePage().mouseHoverOnElectronicsTab();
    }

    @Then("^verify the CellPhones text \"([^\"]*)\"$")
    public void verifyTheCellPhonesText(String expected) {
        new CellPhonesPage().verifyTheTextCellPhones(expected);
    }

    @When("^Click on List View Tab$")
    public void clickOnListViewTab() {
        new CellPhonesPage().clickOnListViewTab();
    }

    @And("^Click on product name Nokia Lumia link$")
    public void clickOnProductNameNokiaLumiaLink() {
        new CellPhonesPage().clickOnProductNameNokiaLumiaLink();
    }

    @Then("^Verify the Nokia Lumia text \"([^\"]*)\"$")
    public void verifyTheNokiaLumiaText(String expected) {
        new NokiaLumia1020Page().verifyTheTextNokiaLumia(expected);
    }

    @And("^Verify the Nokia Lumia price \"([^\"]*)\"$")
    public void verifyTheNokiaLumiaPrice(String expected) {
        new NokiaLumia1020Page().verifyTheNokiaLumiaPrice349(expected);
    }

    @When("^Change quantity to \"([^\"]*)\"$")
    public void changeQuantityTo(String qty) {
        new NokiaLumia1020Page().changeQuantityTo2(qty);
    }

    @And("^Click on ADD TO CART tab$")
    public void clickOnADDTOCARTTab() {
        new NokiaLumia1020Page().clickAddToCartTab();
    }

    @Then("^Verify the product added to cart Message \"([^\"]*)\" on Top green Bar$")
    public void verifyTheProductAddedToCartMessageOnTopGreenBar(String expected) {
        new NokiaLumia1020Page().verifyTheMessageTheProductHasBeenAddedToYourShoppingCart(expected);
    }

    @And("^After that close the bar clicking on the cross Button$")
    public void afterThatCloseTheBarClickingOnTheCrossButton() {
        new NokiaLumia1020Page().afterThatCloseTheBarClickingOnTheCrossButton();
    }

    @When("^MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void mousehoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new NokiaLumia1020Page().moseHoverOnShoppingCartAndClickOnGoToCartButton();
    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String expected) {
        new ShoppingCartPage().verifyTheMessageShoppingCart(expected);
    }

    @And("^Verify the quantity is \"([^\"]*)\"$")
    public void verifyTheQuantityIs(String expected) {
        new ShoppingCartPage().verifyTheQuantity(expected);
    }

    @And("^Verify the Total \"([^\"]*)\"$")
    public void verifyTheTotal(String expected) {
        new ShoppingCartPage().verifyTheTotal698(expected);

    }

    @When("^click on I agree with the terms of service checkbox$")
    public void clickOnIAgreeWithTheTermsOfServiceCheckbox() {
        new ShoppingCartPage().clickOnCheckboxIAgreeWithTheTermsOfService();
    }

    @And("^click on CHECKOUT button$")
    public void clickOnCHECKOUTButton() {
        new ShoppingCartPage().clickOnCheckoutButtonAfterAddingNokiaLumia();
    }

    @Then("^Verify the welcome please sign in Text \"([^\"]*)\"$")
    public void verifyTheWelcomePleaseSignInText(String expected) {
        new ShoppingCartPage().verifyTheTextWelcomePleaseSignIn(expected);
    }

    @When("^Click on REGISTER tab$")
    public void clickOnREGISTERTab() {
        new LoginPage().clickOnRegisterTab();
    }

    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String expected) {
        new LoginPage().verifyTheTextRegister(expected);
    }

    @When("^Fill the all the mandatory fields$")
    public void fillTheAllTheMandatoryFields() {
        new RegisterPage().fillTheMandatoryFieldsForRegistration();
    }

    @And("^Click on REGISTER Button$")
    public void clickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^Verify the your registration completed message \"([^\"]*)\"$")
    public void verifyTheYourRegistrationCompletedMessage(String expected) {
        new RegisterPage().verifyTheMessageYourRegistrationCompleted(expected);
    }

    @When("^Click on CONTINUE tab$")
    public void clickOnCONTINUETab() {
        new RegisterPage().clickOnContinueTabOnRegisterPage();
    }

    @Then("^Verify the shopping cart text \"([^\"]*)\"$")
    public void verifyTheShoppingCartText(String expected) {
        new ShoppingCartPage().verifyTheMessageShoppingCart(expected);
        new LoginPage().clickOnLoginLink();
        new LoginPage().enterEmailField();
        new LoginPage().enterPasswordFiled();
        new LoginPage().clickOnLoginButtonLink();
    }

    @When("^click on I agree with the terms of service$")
    public void clickOnIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnTermsOfServiceCheckboxOnShoppingCartPage();
    }

    @And("^Click on CHECKOUT Btn$")
    public void clickOnCHECKOUTBtn() {
        new ShoppingCartPage().clickCheckoutOnShoppingCartPage();
    }

    @And("^Fill the Mandatory Fields$")
    public void fillTheMandatoryFields() {
        new CheckoutPage().fillTheMandatoryFieldsOnCheckoutPage();
    }

    @And("^Click on Continue$")
    public void clickOnContinue() {
        new CheckoutPage().clickOnContinueOnCheckoutPage();
    }

    @And("^Click on Radio Button second Day Air$")
    public void clickOnRadioButtonSecondDayAir() {
        new CheckoutPage().clickOnRadioButton2ndDayAir();
    }

    @And("^Click on CONTINUE_button$")
    public void clickOnCONTINUE_button() {
        new CheckoutPage().clickOnContinueButtonOnCheckoutPage();
    }

    @And("^Select Radio Button for Credit Card$")
    public void selectRadioButtonForCreditCard() {
        new CheckoutPage().selectRadioButtonForCreditCard();
        new CheckoutPage().clickOnContinueOnCreditCard();
    }

    @And("^Select \"([^\"]*)\" From Select credit card dropdown$")
    public void selectFromSelectCreditCardDropdown(String text) {
        new CheckoutPage().selectVisaFromCreditCardDropdown(text);
    }

    @And("^Fill all details$")
    public void fillAllDetails() {
        new CheckoutPage().fillAllTheDetailsInCreditCard();
    }

    @And("^Click on CONTINUE_Btn$")
    public void clickOnCONTINUE_Btn() {
        new CheckoutPage().clickOnContinueAfterCreditCardDetails();
    }

    @Then("^Verify credit card Payment Method is \"([^\"]*)\"$")
    public void verifyCreditCardPaymentMethodIs(String expected) {
        new CheckoutPage().verifyPaymentMethodIsCreditCard(expected);
    }

    @And("^Verify second day air Shipping Method is \"([^\"]*)\"$")
    public void verifySecondDayAirShippingMethodIs(String expected) {
        new CheckoutPage().verifyShippingMethodIs2ndDayAir(expected);
    }

    @And("^Verify Total price is \"([^\"]*)\"$")
    public void verifyTotalPriceIs(String expected) {
        new CheckoutPage().verifyTotalIs698(expected);
    }

    @When("^Click on CONFIRM_button$")
    public void clickOnCONFIRM_button() {
        new CheckoutPage().clickOnConfirmAfterPaymentMethod();
    }

    @Then("^Verify the thank you message \"([^\"]*)\"$")
    public void verifyTheThankYouMessage(String expected) {
        new CheckoutPage().verifyTheTextThankYou(expected);
    }

    @And("^Verify the success order message \"([^\"]*)\"$")
    public void verifyTheSuccessOrderMessage(String expected) {
        new CheckoutPage().verifyTheMessageYourOrderHasBeenSuccessfullyProcessed(expected);
    }

    @When("^Click on CONTINUE_Bton$")
    public void clickOnCONTINUE_Bton() {
        new CheckoutPage().clickContinueButtonAfterSuccessfulOrder();
    }

    @Then("^Verify the welcom to our store text \"([^\"]*)\"$")
    public void verifyTheWelcomToOurStoreText(String expected) {
        new CheckoutPage().verifyTheTextWelcomeToOurStore(expected);
    }

    @When("^Click on Logout link$")
    public void clickOnLogoutLink() {
        new HomePage().clickOnLogoutLink();
    }

    @Then("^Verify the URL is \"([^\"]*)\"$")
    public void verifyTheURLIs(String expected) {
        new HomePage().verifyTheNopCommerceURL(expected);
    }


}
