Feature: Login Functionality

  Background: 
    Given User Launch Chrome browser
    When User opens URL "http://automationpractice.com/"
    And user navigates to login page

  @Regression @Smoke
  Scenario: Valid Credentials
    And User enters Email as "dadsa234@asd.com" and Password as "adminadmin"
    And Click on Login
    Then User should be get this "My account - My Store"

  @Regression @Smoke
  Scenario Outline: Invalid Credentials
    And User supplies invalid "<email>" and  "<password>"
    And Click on Login
    Then User should be get this "<Login - My Store>"

    Examples: 
      | email                  | password |
      | admin@yoursssatore.com | admin1   |
      | admin@yoursastore.com  | aadmin   |
      |                        |          |

  Scenario: Log Out
    And User enters Email as "dadsa234@asd.com" and Password as "adminadmin"
    And Click on Login
    Then User should be get this "My account - My Store"
    When user clicks on Logout button
    Then user should be navigated to the Home Page
