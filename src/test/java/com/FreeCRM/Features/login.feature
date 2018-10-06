Feature: login

  Background: user try has valid login
    Given User navigate to "https://www.freecrm.com/index.html"

  Scenario: user login to the system
    Given when user navigate to login page
    When user enter username
    When user enter password
    Then user click on login
    Then user log in successfully and view correct
