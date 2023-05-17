Feature: Computer test
  As a User I want to add product to shopping cart on Nop Commerce website

  @sanity @regression
  Scenario: verify product arrange in alphabetical order
    Given I am on homepage
    When I click on "Computers" Menu
    And I click on Desktop
    And I select Sort By position "Name: Z to A"
#    Then verify the product will arrange in Descending order

  @smoke @regression
  Scenario: verify product added to shopping cart successfully
    Given I am on homepage
    When Click on "Computers" Menu.
    And  Click on Desktop
    And  Select Sort By position "Name: A to Z"
    And Click on Add To Cart
    Then verify the Build your Own Computer Text "Build your own computer"
    When Select Ghz Intel Pentium "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And Select GB Ram "8GB [+$60.00]" using Select class.
    And Select HDD radio  GB
    And Select OS radio Vista Premium
    And Check Two Check boxes Microsoft Office  and Total Commander
#    Then Verify the price "$1,475.00"
    When Click on ADD TO CART Button.
    And Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And After that close the bar clicking on the cross button.
    And Then MouseHover on Shopping cart and Click on GO TO CART button.
    Then Verify the Shopping cart message "Shopping cart"
    When Change the Qty to "2"
    And Click on Update shopping cart
    Then Verify the Total"$2,950.00"
    When click on checkbox I agree with the terms of service
    And  Click on CHECKOUT
    Then Verify the SignIn Text "Welcome, Please Sign In!"
    When Click on CHECKOUT AS GUEST Tab
    And Fill the all mandatory field
    And Click on CONTINUE
    And Click on Radio Button Next Day Air
    And Click on CONTINUE Button
    And Select Radio Button Credit Card
    And Select Master card From Select credit card dropdown
    And Fill all the details
    And Click on CONTINUE Tab
    Then Verify Payment Method is "Credit Card"
    And Verify Shipping Method is "Next Day Air"
    And Verify Total is "$2,950.00"
    When Click on CONFIRM
    Then Verify the ThankYou Text "Thank You"
    And Verify the Success message "Your order has been successfully processed!"
    When Click on CONTINUE BTN
    Then Verify the welcome text "Welcome to our store"