Feature: Registration Feature


  Background:

    Given user launches "firefox" browser
    And user opens URL "http://automationpractice.com/"
    And User clicks Sign in
    And User is on Authentication page
    When User enters valid email as "q49062405@yopmail.com"
    And Clicks create an account button
    Then User should land on the registration page


  Scenario: Register with valid input

    When user inputs valid data
    And user clicks register button
    Then page heading should be "MY ACCOUNT"


  Scenario: Register with Invalid input
    When user inputs invalid data
    And user clicks register button
    Then page URL be "MY ACCOUNT"


  Scenario: Register with Blank Fields
    When user leaves field blank
    And user clicks register button
    Then page URL be "MY ACCOUNT"