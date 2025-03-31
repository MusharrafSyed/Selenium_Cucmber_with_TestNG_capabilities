Feature: This file contains Logiin scenarios

  Scenario: User should be able to login with valid username and password.
   Given user enables the feature flags
    | featureFlagName | featureFlagValue |
    | loginFlag       | on               |
    | homeFlag        | on               |
    Given User is on Login Page
    When User enters username "standard_user" and passoword "secret_sauce"
    And User clicks on Login button
    Then User should be on home screen




