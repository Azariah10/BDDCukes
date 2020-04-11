Feature: Test HQ Login Functionality.

  Scenario Outline: Verify Concrete login/logout One-3671.
    Given Login to Concerete App as HQUser with "<username>" and "<password>"
    When User navigate to Dashboard
    Then Click on settings button
    Then Click on Logout
    Then Verify the Logout with "<expectedMsg>"

    Examples: 
      | username               | password          | expectedMsg                                                    |
      | cathyfahey@concrete.cc | gate.tomatoes.F2F | You have been logged out of Concrete! Please close this window |
