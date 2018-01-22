Feature: Check Connect Four Winner

  As a VP of Gaming
  I want my game to check for winners
  So that a player can win the game

  Scenario: Check winner
    Given I have a grid like
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 1 | 1 | 1 | 1 | 0 | 0 | 0 |
    When I check for winners
    Then the winner should be Yellow

  Scenario: Check winner
    Given I have a grid like
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 2 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 2 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 2 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 2 | 0 | 0 | 0 | 0 | 0 | 0 |
    When I check for winners
    Then the winner should be Red

  Scenario: Check winner
    Given I have a grid like
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
    When I check for winners
    Then the winner should be Undefined

  Scenario: Check winner
    Given I have a grid like
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 2 | 1 | 2 | 2 | 0 | 0 | 0 |
      | 1 | 1 | 2 | 1 | 0 | 0 | 0 |
      | 2 | 2 | 1 | 1 | 0 | 0 | 0 |
      | 2 | 1 | 2 | 1 | 0 | 0 | 0 |
    When I check for winners
    Then the winner should be Red

  Scenario: Check winner
    Given I have a grid like
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
      | 1 | 1 | 2 | 1 | 0 | 0 | 0 |
      | 1 | 1 | 2 | 1 | 0 | 0 | 0 |
      | 2 | 2 | 1 | 2 | 0 | 0 | 0 |
      | 2 | 1 | 2 | 1 | 0 | 0 | 0 |
    When I check for winners
    Then the winner should be Yellow