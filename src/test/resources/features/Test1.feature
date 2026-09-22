Feature: Feature to test login page
  Scenario: Test login
    Given Chrome Driver object is needed
    When Enter username
    When Enter password
    When press enter
    Then Assert received string