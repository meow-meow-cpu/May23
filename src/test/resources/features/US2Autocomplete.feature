Feature: User starts typing country name and get suggestions with autocomplete
  Scenario Outline:
    Given the user is on the main page
    Then the user clicks on the "Autocomplete" module
    And the user starts typing "<letters>" in country entry field
    Then the user sees suggestions that start with "<letters>" in the field below
    Examples:
    |letters|
    |ca    |

