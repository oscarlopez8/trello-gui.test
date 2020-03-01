Feature: Login
  Scenario: login with valid credentials
    Given I am on the login page
    When I set user and password with "tester.gui8@gmail.com" and "O1234567l"
    Then I should be on the users home page



