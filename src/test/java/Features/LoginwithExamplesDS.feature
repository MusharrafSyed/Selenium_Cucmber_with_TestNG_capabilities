Feature: This file contains Logiin scenarios

 #Scenario: User should be able to login with valid username and password.
  # ouline added for datat driver testing
  Scenario Outline: User should be able to login with valid username and password.
    Given User is on Login Page
    When User enters username "<UserName>" and passoword "<Password>"
    And User clicks on Login button
    Then User should be on home screen
    Examples:
      | UserName      | Password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |





