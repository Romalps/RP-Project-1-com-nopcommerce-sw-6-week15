package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.AnalysisStrategy;
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

public class CheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1Field;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueBtnLink;

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement radioBtnNextDayAirLink;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButtonLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueBtnAfterCreditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement masterCarromDropdownLink;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberFiled;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expirationDateField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expirationYearField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterPaymentCardDetails;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueAfterSuccessful;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButtonLink;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButtonAfterPlacingOrder;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmLink;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButtonOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement radioButton2ndDayAir;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueBtnOnCheckout;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioButtonOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement continueBtnOnCreditCard;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement visaCreditCard;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expirationMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expirationYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueAfterCreditCardDetail;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]")
    WebElement totalAmount;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfulProcessedMessage;


    // 2.22 Fill the all mandatory field
    public void fillAllMandatoryFieldInBillingAddressForm() {

        // Find the First name field element and send firstname element
        sendTextToElement(firstNameField, "Prime543" + getRandomString(4));
        log.info("Enter First name " + firstNameField.toString());
        // Find the Last name field element and send last name element
        sendTextToElement(lastNameField, "Tester" + getRandomString(4));
        log.info("Enter Last name " + lastNameField.toString());
        //Find Email field element and send email element
        sendTextToElement(emailField, "prime" + getRandomString(4) + "@gmail.com");
        log.info("Enter Email " + emailField.toString());
        // Select the country from country field element
        selectByVisibleTextFromDropDown(countryField, "United Kingdom");
        log.info("Select Country " + countryField.toString());
        // Find City field element and send city element
        sendTextToElement(cityField, "London");
        log.info("Enter City " + cityField.toString());
        //Find address1 field element and send address1 element
        sendTextToElement(address1Field, "123,High Road");
        log.info("Enter Address " + address1Field.toString());
        //Find postcode field element and send postcode element
        sendTextToElement(postcodeField, "HA5 7AL");
        log.info("Enter Postcode " + postcodeField.toString());
        //Find phone number field element and send phone number element
        sendTextToElement(phoneNumberField, "07412589000");
        log.info("Enter phone number " + phoneNumberField.toString());
    }


    // 2.23 Click on “CONTINUE”
    public void ClickOnContinueButtonAfterFillingTheForm() {

        clickOnElement(continueBtnLink);
        log.info("Click on continue button " + continueBtnLink.toString());
    }


    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioBtnForNextDayAir() {

        clickOnElement(radioBtnNextDayAirLink);
        log.info("Click on Next Day Air radio button " + radioBtnNextDayAirLink.toString());
    }


    // 2.25 Click on “CONTINUE”
    public void clickOnContinueButtonAfterClickingTheNextDayAirRadioButton() {

        clickOnElement(continueButtonLink);
        log.info("Click on continue button " + continueButtonLink.toString());
    }


    //2.26 Select Radio Button “Credit Card
    public void selectRadioButtonForCreditCard() {

        clickOnElement(creditCardRadioButton);
        log.info("Select Credit card radio button" + creditCardRadioButton.toString());
    }


    // click on continue button
    public void clickOnContinueButtonAfterSelectingCreditCard() {

        clickOnElement(continueBtnAfterCreditCard);
        log.info("Click on Continue button " + continueBtnAfterCreditCard.toString());
    }


    // 2.27 Select “Master card” From Select credit card dropdown
    public void selectMasterCardFromCreditCardDropdown() {
        selectByVisibleTextFromDropDown(masterCarromDropdownLink, "Master card");
        log.info("Select Master card from dropdown " + masterCarromDropdownLink.toString());
    }


    // 2.28 Fill all the details
    public void fillAllPaymentDetails() {
        // Find cardholder name field element and send element
        sendTextToElement(cardHolderNameField, "Prime543");
        log.info("Enter Card Holder name " + cardHolderNameField.toString());

        // Find card number field element and send element
        sendTextToElement(cardNumberFiled, "5105105105105100");
        log.info("Enter Card number " + cardNumberFiled.toString());

        // Find Expiration date field element and send element
        selectByVisibleTextFromDropDown(expirationDateField, "10");
        log.info("Enter Expiration Date " + expirationDateField.toString());

        selectByVisibleTextFromDropDown(expirationYearField, "2028");
        log.info("Enter Expiration Year " + expirationYearField.toString());

        //  Find Card code field element and send element
        sendTextToElement(cardCodeField, "456");
        log.info("Enter Card Code " + cardCodeField.toString());
    }


    // 2.29 Click on “CONTINUE”
    public void clickOnContinueAfterPaymentCardDetails() {

        clickOnElement(continueAfterPaymentCardDetails);
        log.info("Click on continue button " + continueAfterPaymentCardDetails.toString());
    }

    public void verifyPaymentMethodIsCreditCard(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(paymentMethodText), expectedMessage);
    }

    public void verifyShippingMethodIsNextDayAir(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(shippingMethodText), expectedMessage);
    }

    public void verifyTotalIs2950(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(totalAmount), expectedMessage);
    }

    // 2.34 Click on “CONFIRM”
    public void clickOnConfirmButton() {

        clickOnElement(confirmButtonLink);
        log.info("Click on Confirm button " + confirmButtonLink.toString());
    }

    public void verifyTheTextThankYou(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(thankYouText), expectedMessage);
    }

    public void verifyTheMessageYourOrderHasBeenSuccessfullyProcessed(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(successfulProcessedMessage), expectedMessage);
    }

    //2.37 Click on “CONTINUE”
    public void clickOnContinueButtonAfterPlacingOrderSuccessfully() {

        clickOnElement(continueButtonAfterPlacingOrder);
        log.info("Click on Continue button " + continueButtonAfterPlacingOrder.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToOurStoreText;

    public void verifyTheTextWelcomeToOurStore(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(welcomeToOurStoreText), expectedMessage);
    }
//*********************************************************

    //2.27 Fill the Mandatory fields
    public void fillTheMandatoryFieldsOnCheckoutPage() {

        // Find Country field element and select element

        selectByVisibleTextFromDropDown(country, "India");
        log.info("Enter Country " + country.toString());
        // Find City field element and send element
        sendTextToElement(city, "Mumbai");
        log.info("Enter City " + city.toString());
        // Find Address1 field element and send element
        sendTextToElement(address1, "45,Joohu Lane");
        log.info("Enter Address " + address1.toString());
        // Find Postcode field element and send element
        sendTextToElement(postcode, "385698");
        log.info("Enter Postcode " + postcode.toString());
        // Find Phone Number field element and send element
        sendTextToElement(phoneNumber, "0981385698");
        log.info("Enter phone number " + phoneNumber.toString());
    }


    //2.28 Click on “CONTINUE”
    public void clickOnContinueOnCheckoutPage() {

        clickOnElement(continueButtonOnCheckout);
        log.info("Click on continue button " + continueButtonOnCheckout.toString());
    }


    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOnRadioButton2ndDayAir() {

        clickOnElement(radioButton2ndDayAir);
        log.info("Click on 2nd Day Air radio button " + radioButton2ndDayAir.toString());
    }


    //2.30 Click on “CONTINUE”
    public void clickOnContinueButtonOnCheckoutPage() {

        clickOnElement(continueBtnOnCheckout);
        log.info("Click on Continue button  " + continueBtnOnCheckout.toString());
    }


    //2.31 Select Radio Button “Credit Card”
    public void selectRadioButtonOnCreditCard() {

        clickOnElement(radioButtonOnCreditCard);
        log.info("Select Credit Card radio button " + radioButtonOnCreditCard.toString());
    }


    // Click on continue button
    public void clickOnContinueOnCreditCard() {

        clickOnElement(continueBtnOnCreditCard);
        log.info("Click on Continue button " + continueBtnOnCreditCard.toString());
    }


    //2.32 Select “Visa” From Select credit card dropdown
    public void selectVisaFromCreditCardDropdown(String text) {
        selectByVisibleTextFromDropDown(visaCreditCard, text);
        log.info("Select Visa from drop down " + visaCreditCard.toString());
    }


    //2.33 Fill all the details
    public void fillAllTheDetailsInCreditCard() {

        // Find Cardholder name field element and send element
        sendTextToElement(cardHolderName, "Prime");
        log.info("Enter Card holder name " + cardHolderName.toString());
        // Find Card Number field element and send element
        sendTextToElement(cardNumber, "5555555555554444");
        log.info("Enter Card number " + cardNumber.toString());
        // Find Expiration date field element and select element
        log.info("Select Expiration Month " + expirationMonth.toString());
        selectByValueFromDropDown(expirationMonth, "10");

        selectByValueFromDropDown(expirationYear, "2027");
        log.info("Select Expiration Year " + expirationYear.toString());
        // Find Card code number name field element and send element
        sendTextToElement(cardCodeNumber, "789");
        log.info("Enter Card code number " + cardCodeNumber.toString());
    }


    //2.34 Click on “CONTINUE”
    public void clickOnContinueAfterCreditCardDetails() {

        clickOnElement(continueAfterCreditCardDetail);
        log.info("Click on Continue button " + continueAfterCreditCardDetail.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement secondDayAirShippingMethod;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong[contains(text(),'$698.00')]")
    WebElement total698Text;
      public void verifyShippingMethodIs2ndDayAir(String expectedMessage){
          Assert.assertEquals(getTextFromElement(secondDayAirShippingMethod),expectedMessage);
      }
    public void verifyTotalIs698(String expectedMessage){
          Assert.assertEquals(getTextFromElement(total698Text),expectedMessage);
    }

    //2.38 Click on “CONFIRM”
    public void clickOnConfirmAfterPaymentMethod() {


        clickOnElement(confirmLink);
        log.info("Click on Confirm button " + confirmLink.toString());
    }


    //2.41 Click on “CONTINUE”
    public void clickContinueButtonAfterSuccessfulOrder() {


        clickOnElement(continueAfterSuccessful);
        log.info("Click on Continue button " + continueAfterSuccessful.toString());
    }


}
