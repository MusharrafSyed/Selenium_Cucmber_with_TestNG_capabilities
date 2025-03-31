Feature: Login Page

  Scenario: Login with multiple users
    Given user navigates to the login page
    When the user logs in with the following credentials:
      | username | password             |
      | tomsmith | SuperSecretPassword! |
      | invalid  | wrongpass            |
