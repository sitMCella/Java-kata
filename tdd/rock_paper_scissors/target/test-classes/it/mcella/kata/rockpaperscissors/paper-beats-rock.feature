Feature: Paper beats Rock

  As a player
  I want paper to beat rock
  So that I can play with rules I'm familiar with

  Scenario: Player One win
    Given Player One have chosen paper
    When Player Two chooses rock
    Then Player One should win

  Scenario: Player Two win
    Given Player One have chosen rock
    When Player Two chooses paper
    Then Player Two should win