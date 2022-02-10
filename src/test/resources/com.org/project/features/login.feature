#Author:
# Description:
  #Jira ID:

@smoke @regression @sanity
Feature: test login

@rajender
Scenario Outline: Verify login success on sauce website
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

