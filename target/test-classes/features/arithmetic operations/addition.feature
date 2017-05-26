Feature: as a user I want to be able to use the calculator to add two integer numbers

  Scenario: simple addition of single digit natural numbers
    When the user fills in the first argument with '1'
    And the user fills in the second argument with '2'
    And the user selects addition
    Then the user should see as result the value '3'

  Scenario: addition of two digits natural numbers
    When the user fills in the first argument with '11'
    And the user fills in the second argument with '22'
    And the user selects addition
    Then the user should see as result the value '33'

  Scenario: addition of one positive and one negative number
    When the user fills in the first argument with '11'
    And the user fills in the second argument with '-22'
    And the user selects addition
    Then the user should see as result the value '-11'

