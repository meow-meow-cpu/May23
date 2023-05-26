Feature: User completes a form using dropdowns

  Scenario Outline:
    Given the user is on the main page
    Then the user clicks on the "Dropdown" module
    When the user clicks on the "dropdown" selection
    #Then the user sees 2 options to choose from
    #|Option 1|
    #|Option 2|
   # When the user clicks on the "<Option>" selection
    Then the user selects "<Option>"
    When the user clicks on the "year" selection
    Then the user selects "1990"
    #verify that 1990 is selected
    When the user clicks on the "month" selection
    Then the user selects "May"
    When the user clicks on the "day" selection
    Then the user selects "1"
    When the user clicks on the "state" selection
    Then the user selects "Alabama"
    When the user selects Java and C# selection
    Then Java and C# are selected
    When the user selects "Google" website
    Then the title of the page is "Google"
    Examples:
      |Option|
      |Option 2|