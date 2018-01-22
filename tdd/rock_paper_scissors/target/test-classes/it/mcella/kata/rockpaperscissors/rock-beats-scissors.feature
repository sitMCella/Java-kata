Feature: Rock beats Scissors

  As a player
  I want rock to beat scissors
  So that I can play with rules I'm familiar with

  Scenario: Player One win
    Given Player One have chosen rock
    When Player Two chooses scissors
    Then Player One should win

  Scenario: Player Two win
    Given Player One have chosen scissors
    When Player Two chooses rock
    Then Player Two should win
