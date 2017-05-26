Feature: as a user I want to be able to multiply two integer numbers

  Scenario: multiplication of two positive integers
    When the user fills in the first argument with '2'
    And the user fills in the second argument with '1'
    And the user selects multiplication
    Then the user should see as result the value '2'

  Scenario: multiplication of one positive and one negative integer
    When the user fills in the first argument with '2'
    And the user fills in the second argument with '-1'
    And the user selects multiplication
    Then the user should see as result the value '-2'

  Scenario: multiplication of two negative integers
    When the user fills in the first argument with '-2'
    And the user fills in the second argument with '-1'
    And the user selects multiplication
    Then the user should see as result the value '2'
