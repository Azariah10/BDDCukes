Feature: Test Tab Functionality.

  @Smoke
  Scenario Outline: Verify the presence of Tabs Upon User Login
  .
    Given Login to Concerete App as User with "<username>" and "<password>"
    And  User navigates to Dashboard
    When User Clicks on the tab buttons He should  be navigated to respective pages

    Examples:
      | username               | password          |
      | radhikacapitani@concrete.cc| gate.tomatoes.KvM |