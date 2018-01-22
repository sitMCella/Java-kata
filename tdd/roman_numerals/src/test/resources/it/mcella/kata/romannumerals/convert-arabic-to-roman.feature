Feature: Convert Arabic Number to Roman Number

  As a game developer
  I want to be able to convert a number to a numeral
  So that I can label my game releases using Roman numerals

  Scenario Outline: Convert Arabic Number to Roman Number
    Given I have started the converter
    When I enter <number>
    Then <numeral> is returned

  Examples:
    | number | numeral   |
    | 1      | I         |
    | 3      | III       |
    | 9      | IX        |
    | 1066   | MLXVI     |
    | 1989   | MCMLXXXIX |