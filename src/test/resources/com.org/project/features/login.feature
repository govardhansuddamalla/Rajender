Feature: test login
  @KT @smoke @regression @sanity @login
  Scenario Outline: Verify login success on sauce website
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And log in with "<Username>" and "<Password>"
    And logout from application
    And close the browser
    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |

   # And login into application with below details
   #   | standard_user |
   #   | secret_sauce  |

 #  And login into application with below details
 #    | username | standard_user |
 #    | password | secret_sauce  |


  Scenario Outline: Verify login validations
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And log in with "<Username>" and "<Password>"
   # And verify <<Epic sadface: Sorry, this user has been locked out>> error message

    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |
      | standard_user | secret_sauce |



  Scenario Outline: Verify buy a product on sauce website
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And log in with "<Username>" and "<Password>"
    And add item to cart
    And go to cart
    And verify price on cart
    And click on checkout
    And Pass below data
    |fname|lname|zipcode|
    |<fname>|<lname>|<zipcode>|
    And click on continue
    And verify details
    And click on finish
    And verify success message "THANK YOU FOR YOUR ORDER"
    And logout from application
    And close the browser
    Examples:
      | Username      | Password     |fname|lname|zipcode|
      | standard_user | secret_sauce |     |     |       |