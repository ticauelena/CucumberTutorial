Feature: Test login functionality in CAIR application
  @smoke
  Scenario: Check login is successful with valid credentials in CAIR application
    Given HRMS is open
    And user is on login page
    When user enters username and password
    And clicks to invalidate previous session checkbox
    And clicks to login button
    Then the user is logged in HRMS
    When user click on logout  button
    Then the page should be logout page
