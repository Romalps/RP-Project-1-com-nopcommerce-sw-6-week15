package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComputerTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on \"([^\"]*)\" Menu$")
    public void iClickOnMenu(String menu) {
        new HomePage().selectMenu(menu);
        new HomePage().clickOnComputerMenu();
    }


    @And("^I click on Desktop$")
    public void iClickOnDesktop() {
        new HomePage().clickOnDesktopFromComputerMenuTab();
    }

    @And("^I select Sort By position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String sortBy) {
        new DesktopPage().selectSortByPositionNameZToA(sortBy);
    }

//    @Then("^verify the product will arrange in Descending order$")
//    public void verifyTheProductWillArrangeInDescendingOrder() {
//        new DesktopPage().verifyTheProductWillArrangeInDescendingOrder();
//    }


    @When("^Click on \"([^\"]*)\" Menu\\.$")
    public void clickOnMenu(String menu) {
        new HomePage().selectMenu(menu);
        new HomePage().clickOnComputerMenu();
    }

    @And("^Click on Desktop$")
    public void clickOnDesktop() {
        new HomePage().clickOnDesktopFromComputerMenuTab();
    }

    @And("^Select Sort By position \"([^\"]*)\"$")
    public void selectSortByPosition(String sortBy) {
        new DesktopPage().selectSortByPositionNameAToZ(sortBy);
    }

    @And("^Click on Add To Cart$")
    public void clickOnAddToCart() {
        new DesktopPage().clickOnAddToCArtButton();
    }

    @Then("^verify the Build your Own Computer Text \"([^\"]*)\"$")
    public void verifyTheBuildYourOwnComputerText(String expectedMessage) {
        new BuildYourOwnComputerPage().verifyTheTextBuildYourOwnComputer(expectedMessage);
    }

    @When("^Select Ghz Intel Pentium \"([^\"]*)\" using Select class$")
    public void selectGhzIntelPentiumUsingSelectClass(String text) {
        new BuildYourOwnComputerPage().select2_2GHxIntelPentiumDualCoreE2200(text);
    }

    @And("^Select GB Ram \"([^\"]*)\" using Select class\\.$")
    public void selectGBRamUsingSelectClass(String text) {
        new BuildYourOwnComputerPage().select8GBRam(text);
    }

    @And("^Select HDD radio  GB$")
    public void selectHDDRadioGB() {
        new BuildYourOwnComputerPage().selectHDDRadio400GB();
    }

    @And("^Select OS radio Vista Premium$")
    public void selectOSRadioVistaPremium() {
        new BuildYourOwnComputerPage().selectOSRadioVistaPremium();
    }

    @And("^Check Two Check boxes Microsoft Office  and Total Commander$")
    public void checkTwoCheckBoxesMicrosoftOfficeAndTotalCommander() {

        new BuildYourOwnComputerPage().checkTwoBoxesMicrosoftOfficeAndTotalCommander();
    }

//    @Then("^Verify the price \"([^\"]*)\"$")
//    public void verifyThePrice(String expectedMessage) {
//        new BuildYourOwnComputerPage().verifyThePrice1475(expectedMessage);
//    }

    @When("^Click on ADD TO CART Button\\.$")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @And("^Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void verifyTheMessageOnTopGreenBar(String expectedMessage) {
        new BuildYourOwnComputerPage().verifyTheMessageTheProductHasBeenAddedTOYourShoppingCart(expectedMessage);
    }

    @And("^After that close the bar clicking on the cross button\\.$")
    public void afterThatCloseTheBarClickingOnTheCrossButton() {
        new BuildYourOwnComputerPage().closeTheBarClickingOnTheCrossButton();
    }

    @And("^Then MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void thenMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new BuildYourOwnComputerPage().mouseHoverOnShoppingCartAndClickOnGoTOCartButton();
    }

    @Then("^Verify the Shopping cart message \"([^\"]*)\"$")
    public void verifyTheShoppingCartMessage(String expectedMessage) {
        new ShoppingCartPage().verifyTheMessageShoppingCart(expectedMessage);
    }

    @When("^Change the Qty to \"([^\"]*)\"$")
    public void changeTheQtyTo(String qty) {
        new ShoppingCartPage().changeTheQtyTo2(qty);
    }

    @And("^Click on Update shopping cart$")
    public void clickOnUpdateShoppingCart() {
        new ShoppingCartPage().updateTheShoppingCartAfterChangingQty();
    }

    @Then("^Verify the Total\"([^\"]*)\"$")
    public void verifyTheTotal(String expectedMessage) {
        new ShoppingCartPage().verifyTheTotal2950(expectedMessage);
    }

    @When("^click on checkbox I agree with the terms of service$")
    public void clickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickTermsOfServiceCheckbox();
    }

    @And("^Click on CHECKOUT$")
    public void clickOnCHECKOUT() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^Verify the SignIn Text \"([^\"]*)\"$")
    public void verifyTheSignInText(String expectedMessage) {
        new ShoppingCartPage().verifyTheTextWelcomePleaseSignIn(expectedMessage);
    }

    @When("^Click on CHECKOUT AS GUEST Tab$")
    public void clickOnCHECKOUTASGUESTTab() {
        new LoginPage().clickOnCheckoutAsGuestTab();
    }

    @And("^Fill the all mandatory field$")
    public void fillTheAllMandatoryField() {
        new CheckoutPage().fillAllMandatoryFieldInBillingAddressForm();
    }

    @And("^Click on CONTINUE$")
    public void clickOnCONTINUE() {
        new CheckoutPage().ClickOnContinueButtonAfterFillingTheForm();
    }

    @And("^Click on Radio Button Next Day Air$")
    public void clickOnRadioButtonNextDayAir() {
        new CheckoutPage().clickOnRadioBtnForNextDayAir();
    }

    @And("^Click on CONTINUE Button$")
    public void clickOnCONTINUEButton() {
        new CheckoutPage().clickOnContinueButtonAfterClickingTheNextDayAirRadioButton();
    }

    @And("^Select Radio Button Credit Card$")
    public void selectRadioButtonCreditCard() {
        new CheckoutPage().selectRadioButtonForCreditCard();
        new CheckoutPage().clickOnContinueButtonAfterSelectingCreditCard();
    }

    @And("^Select Master card From Select credit card dropdown$")
    public void selectMasterCardFromSelectCreditCardDropdown() {
        new CheckoutPage().selectMasterCardFromCreditCardDropdown();
    }

    @And("^Fill all the details$")
    public void fillAllTheDetails() {
        new CheckoutPage().fillAllPaymentDetails();
    }

    @And("^Click on CONTINUE Tab$")
    public void clickOnCONTINUETab() {
        new CheckoutPage().clickOnContinueAfterPaymentCardDetails();
    }

    @Then("^Verify Payment Method is \"([^\"]*)\"$")
    public void verifyPaymentMethodIs(String expectedMessage) {
        new CheckoutPage().verifyPaymentMethodIsCreditCard(expectedMessage);
    }

    @And("^Verify Shipping Method is \"([^\"]*)\"$")
    public void verifyShippingMethodIs(String expectedMessage) {
        new CheckoutPage().verifyShippingMethodIsNextDayAir(expectedMessage);
    }

    @And("^Verify Total is \"([^\"]*)\"$")
    public void verifyTotalIs(String expectedMessage) {
        new CheckoutPage().verifyTotalIs2950(expectedMessage);
    }

    @When("^Click on CONFIRM$")
    public void clickOnCONFIRM() {
        new CheckoutPage().clickOnConfirmButton();
    }

    @Then("^Verify the ThankYou Text \"([^\"]*)\"$")
    public void verifyTheThankYouText(String expectedMessage) {
        new CheckoutPage().verifyTheTextThankYou(expectedMessage);
    }

    @And("^Verify the Success message \"([^\"]*)\"$")
    public void verifyTheSuccessMessage(String expectedMessage) {
        new CheckoutPage().verifyTheMessageYourOrderHasBeenSuccessfullyProcessed(expectedMessage);
    }

    @When("^Click on CONTINUE BTN$")
    public void clickOnCONTINUEBTN() {
        new CheckoutPage().clickOnContinueButtonAfterPlacingOrderSuccessfully();
    }

    @Then("^Verify the welcome text \"([^\"]*)\"$")
    public void verifyTheWelcomeText(String expectedMessage) {
        new CheckoutPage().verifyTheTextWelcomeToOurStore(expectedMessage);
    }


}
