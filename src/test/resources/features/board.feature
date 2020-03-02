Feature: Board

  Scenario: Creates a Board, using the button "Create new board" of Home Page.
    Given I am on the login page
      And I set user and password with "oscar.lopez@fundacion-jala.org" and "O3728236l"
    When I create a new Board with name "New Board to test"
    Then I should see the name of Board in BoardPage
    When I go to the Home page using top menu
      And I should see the Board in the Recently Viewed section
      And I should see the Board in the Personal Boards section
