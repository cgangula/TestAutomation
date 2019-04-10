@tag
Feature: Math feature

  @Addition @SmokeTests
  Scenario Outline: Adding two numbers
    Given I have two numbers <number1> and <number2>
    When I add two numbers
    Then I verify expected value <value>

    Examples: 
      | number1 | number2 | value |
      |       2 |       3 |     5 |
      |     100 |     130 |   230 |

  @Subtraction @SmokeTests
  Scenario Outline: Subtraction two numbers
    Given I have two numbers <number1> and <number2>
    When I subtract two numbers
    Then I verify expected value <value>

    Examples: 
      | number1 | number2 | value |
      |       5 |       3 |     2 |
      |     200 |     130 |    70 |
