Feature: OpenHRM Home page Scenarios.

Background:
  Given User in on the login page
  When User enters valid username "Admin" and valid password "admin123"
  And User click on the login button
  Then Home page should be diplayed


  Scenario: Search button shold be displayed when upon clicking on leave button
    When User click on leave button
    Then Search should button should be displayed


   Scenario: logout option or link displayed
    When User click on user profile button on the right side
    Then pull down menu opne and logout link should be diplayed

