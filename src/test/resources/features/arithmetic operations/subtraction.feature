Feature: as a user I want to be able to subtract two integer numbers

  Scenario: subtraction of two single digit natural numbers with positive result
    When the user fills in the first argument with '2'
    And the user fills in the second argument with '1'
    And the user selects subtraction
    Then the user should see as result the value '1'

  Scenario: subtraction of two single digit natural numbers with negative result
    When the user fills in the first argument with '1'
    And the user fills in the second argument with '2'
    And the user selects subtraction
    Then the user should see as result the value '-1'

  Scenario: subtraction of a positive and a negative integer
    When the user fills in the first argument with '1'
    And the user fills in the second argument with '-2'
    And the user selects subtraction
    Then the user should see as result the value '3'

  Scenario: subtraction of two negative numbers
    When the user fills in the first argument with '-1'
    And the user fills in the second argument with '-2'
    And the user selects subtraction
    Then the user should see as result the value '1'


