Feature: Scissors beats Paper

  As a player
  I want scissors to beat paper
  So that I can play with rules I'm familiar with

  Scenario: Player One win
    Given Player One have chosen scissors
    When Player Two chooses paper
    Then Player One should win

  Scenario: Player Two win
    Given Player One have chosen paper
    When Player Two chooses scissors
    Then Player Two should win