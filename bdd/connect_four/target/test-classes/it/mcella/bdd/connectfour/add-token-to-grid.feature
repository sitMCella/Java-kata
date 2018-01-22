Feature: Connect Four game play

  As a VP of Gaming
  I want players to be able to place tokens
  So that they can play

  Scenario Outline: Add token to grid
    Given a grid with <number> tokens in column <column>
    When I place a token in that column
    Then that token should be in row <row>

  Examples:
    | number | column | row |
    | 0      | B      | 1   |
    | 2      | D      | 3   |
    | 5      | F      | 6   |
    | 6      | A      | 0   |
