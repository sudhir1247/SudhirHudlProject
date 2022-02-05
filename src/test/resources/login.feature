@mytest
Feature: Login functionality

  @validLogin
  Scenario: Invalid login scenario
    Given i navigate to the "Home" page
    When I enter email id "msudhirvarma@gmail.com" and password "incorrectPassword"
    And I click on login button
    Then Login error should be displayed.

  @validLogin
  Scenario: valid login scenario
    Given i navigate to the "Home" page
    When I enter email id "msudhirvarma@gmail.com" and password "correctPassword15"
    And I click on login button
    Then Login page should be displayed.
