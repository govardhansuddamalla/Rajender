#Author: Rajenderkoyyeda
#Keywords Summary :
#Feature: List of Initial Test Data scenarios.
#Developed By : Rajender Koyyeda

@KT @smoke @regression @sanity @login
Feature: Test project sauce

 # Background: delete the cookies
 #   Given Find the cookies
 #   When Delete the cookies
 #   Then verify cookies deleted



  Scenario: Verify buy a product on sauce website
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And login into application with below details
      | username      | password     |
      | standard_user | secret_sauce |





  #  When add item to cart
  #  And navigate to cart
  #  Then verify item added to cart
  #  And verify item cost
  #  And click on Checkout
  #  And provide the details
  #    | firstName | lastName | zipCode |
  #    | govardhan | kadapa   | 123123  |
  #  And verify details on checkout step2
  #  And click on finish button
  #  And verify success message as "THANK YOU FOR YOUR ORDER"
  #  And logout the application
  #  And close the browser
  #  And logout from DxpMember application