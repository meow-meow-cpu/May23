Feature: User should be able to add or remove elements on the webpage

  Scenario:
    Given the user is on the main page
    Then the user clicks on the "Add/Remove Elements" module
    And the user clicks "Add Element" button
    Then the user verifies that "Delete" button appeared
    And the user clicks "Delete" button
    Then the user verifies that "Delete" button disappears