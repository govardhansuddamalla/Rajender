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

 Scenario Outline: Verify login success on sauce website  #TASK2
   Given Open the browser
   And launch the website "https://www.saucedemo.com/"
   And login into application with below details
     | username   | password   |
     | <username> | <password> |
   And logout from application
   And close the browser
   Examples:
     | username      | password     |
     | standard_user | secret_sauce |



 #  And login into application with below details
 #    | standard_user |
 #    | secret_sauce  |

 #  And login into application with below details
 #    | username | standard_user |
 #    | password | secret_sauce  |

  @govardhan
  Scenario Outline: Verify login validations with different users #TASK1
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And log in with "<Username>" and "<Password>"
    And verify "<errorMessage>" error message
    And close the browser
    Examples:
      | Username                 | Password      | errorMessage                                                              |
      | locked_out_user          | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                       |
      | problem_user             | secret_sauce1 | Epic sadface: Username and password do not match any user in this service |
      | performance_glitch_user1 | secret_sauce  | Epic sadface: Username and password do not match any user in this service |



Scenario Outline: Verify buy a product on sauce website #TASK3
  Given Open the browser
  And launch the website "https://www.saucedemo.com/"
  And log in with "<Username>" and "<Password>"
  And add item to cart
  And go to cart
  And verify price "<expectedPrice>" on cart
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
    | Username      | Password     ||expectedPrice|fname|lname|zipcode|
    | standard_user | secret_sauce ||$29.99|mahesh|g   |500020 |