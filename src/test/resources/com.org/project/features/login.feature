
@smoke @regression @sanity
Feature: test login


   #***********************************learning***********************************
 #  And login into application with below details
 #    | standard_user |
 #    | secret_sauce  |

 #  And login into application with below details
 #    | username | standard_user |
 #    | password | secret_sauce  |
 # ***********************************learning***********************************

 # Background: login into sauce application
 # Given Open the browser
 # When launch the website "https://www.saucedemo.com/"
 # Then log in with below data
 # | Username      | Password     |
 # | standard_user | secret_sauce |


#@task
#  Scenario: Verify login success on sauce website
#    When logout from application
#    Then close the browser

@task2
Scenario Outline: Verify login success on sauce website  #TASK2 vertical data read
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


  @task1
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

  @task3
  Scenario Outline: Verify buy a product on sauce website #TASK3
    And add item to cart
    And go to cart
    And click on checkout
    And Pass below data
      | fname   | lname   | zipcode   |
      | <fname> | <lname> | <zipcode> |
    And click on continue
    And verify details
    And click on finish
    And verify success message "THANK YOU FOR YOUR ORDER"
    And logout from application
    And close the browser
    Examples:
      | fname  | lname | zipcode |
      | mahesh | g     | 500020  |

  @task4
  Scenario Outline: Verify login success on sauce website  #TASK4 by entering user name with robot class
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And enter the username using robot class
    And enter the "<password>" and login into the application
    And Add all products to the cart
    And logout from application
    And close the browser
    Examples:
      | password     |
      | secret_sauce |

  @task5
  Scenario Outline: Verify login success on sauce website  #TASK5 by entering user name with scanner class
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And enter the username using scanner class
    And enter the "<password>" and login into the application
    And logout from application
    And close the browser
    Examples:
      | password     |
      | secret_sauce |
