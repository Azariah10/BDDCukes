Feature: Test Login Functionality.

  @Regression
  Scenario Outline: Verify Concrete login/logout with Valid credentials One-3671.
    Given Login to Concerete App as User with "<username>" and "<password>"
    When User navigate to Dashboard
    Then Click on settings button
    Then Click on Logout
    Then Verify the Logout with "<expectedMsg>"

    Examples:
      | username               | password          | expectedMsg                                                    |
      |portiahendrix@concrete.cc|gate.tomatoes.Imj|You have been logged out of Concrete! Please close this window |
      |joanngrayson@concrete.cc|gate.tomatoes.ESv|You have been logged out of Concrete! Please close this window |
      |shoepeoplestore051@concrete.cc|gate.tomatoes.WUY|You have been logged out of Concrete! Please close this window |


  @Regression
  Scenario Outline: Verify Concrete login with Invalid Credentials One-3671.
    Given Login to Concerete App as User with "<username>" and "<password>"
    Then Verify the Failed Login with "<expectedMsg>"

    Examples:
      | username               | password          | expectedMsg                                                    |
      | portiahendr1ix@concrete.cc | gate.tomatoes.Imj | Please enter a valid email address and password. |
      |joanngrayson@concrete.cc|gatse.tomatoes.ESv|Please enter a valid email address and password. |
      |shoepeoplestor3e051@concrete.cc| gatde.tomatoes.WUY|Please enter a valid email address and password. |
