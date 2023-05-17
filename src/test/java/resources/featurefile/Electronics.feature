Feature: Electronics Test

  As a user I want to add product to shopping cart and place order on Nop Commerce website
  @sanity @regression
  Scenario: verify user should navigate to CellPhones page successfully
    Given I am on homepage
    When mouse hover on Electronics tab and mouse hover on CellPhones and click
    Then verify the CellPhones text "Cell phones"

  @smoke @regression
  Scenario: verify that the product added successfully and place order successfully
    Given I am on homepage
    When mouse hover on Electronics tab and mouse hover on CellPhones and click
    Then verify the CellPhones text "Cell phones"
    When Click on List View Tab
    And Click on product name Nokia Lumia link
    Then Verify the Nokia Lumia text "Nokia Lumia 1020"
    And Verify the Nokia Lumia price "$349.00"
    When Change quantity to "2"
    And Click on ADD TO CART tab
    Then Verify the product added to cart Message "The product has been added to your shopping cart" on Top green Bar
    And After that close the bar clicking on the cross Button
    When MouseHover on Shopping cart and Click on GO TO CART button.
    Then Verify the message "Shopping cart"
    And Verify the quantity is "2"
    And Verify the Total "$698.00"
    When click on I agree with the terms of service checkbox
    And click on CHECKOUT button
    Then Verify the welcome please sign in Text "Welcome, Please Sign In!"
    When Click on REGISTER tab
    Then Verify the text "Register"
    When Fill the all the mandatory fields
    And Click on REGISTER Button
    Then Verify the your registration completed message "Your registration completed"
    When Click on CONTINUE tab
    Then Verify the shopping cart text "Shopping cart"
    When click on I agree with the terms of service
    And Click on CHECKOUT Btn
    And Fill the Mandatory Fields
    And Click on Continue
    And Click on Radio Button second Day Air
    And Click on CONTINUE_button
    And Select Radio Button for Credit Card
    And Select "Visa" From Select credit card dropdown
    And Fill all details
    And Click on CONTINUE_Btn
    Then Verify credit card Payment Method is "Credit Card"
    And Verify second day air Shipping Method is "2nd Day Air"
    And Verify Total price is "$698.00"
    When Click on CONFIRM_button
    Then Verify the thank you message "Thank You"
    And Verify the success order message "Your order has been successfully processed!"
    When Click on CONTINUE_Bton
    Then Verify the welcom to our store text "Welcome to our store"
    When Click on Logout link
    Then Verify the URL is "https://demo.nopcommerce.com/"