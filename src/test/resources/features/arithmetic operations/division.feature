Feature: as a user I want to be able to divide two integer numbers

  Scenario: division of two positive integers (exact result)
    When the user fills in the first argument with '4'
    And the user fills in the second argument with '2'
    And the user selects division
    Then the user should see as result the value '2'

  Scenario: division of two negative integers (exact result)
    When the user fills in the first argument with '-4'
    And the user fills in the second argument with '-2'
    And the user selects division
    Then the user should see as result the value '2'

  Scenario: division of a positive and a negative integer (exact result)
    When the user fills in the first argument with '4'
    And the user fills in the second argument with '-2'
    And the user selects division
    Then the user should see as result the value '-2'

  Scenario: division of a integer by zero
    When the user fills in the first argument with '4'
    And the user fills in the second argument with '0'
    And the user selects division
    Then the user should see as result the value 'NaN'

  Scenario: division of zero by an integer
    When the user fills in the first argument with '0'
    And the user fills in the second argument with '1'
    And the user selects division
    Then the user should see as result the value '0'


