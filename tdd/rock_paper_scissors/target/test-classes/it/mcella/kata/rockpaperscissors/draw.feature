Feature: Same Moves result in Draw

  As a player
  I want the same moves to draw
  So that I can play with rules I'm familiar with

  Scenario: Rock Gesture
    Given Player One have chosen rock
    When Player Two chooses rock
    Then Both should win

  Scenario: Scissors Gesture
    Given Player One have chosen scissors
    When Player Two chooses scissors
    Then Both should win

  Scenario: Paper Gesture
    Given Player One have chosen paper
    When Player Two chooses paper
    Then Both should win