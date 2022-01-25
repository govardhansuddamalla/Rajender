Feature: test login
  @KT @smoke @regression @sanity @login
  Scenario Outline: Verify buy a product on sauce website
    Given Open the browser
    And launch the website "https://www.saucedemo.com/"
    And log in with "<Username>" and "<Password>"
    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |

   # And login into application with below details
   #   | standard_user |
   #   | secret_sauce  |

 #  And login into application with below details
 #    | username | standard_user |
 #    | password | secret_sauce  |