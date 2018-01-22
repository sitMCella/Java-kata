$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("it/mcella/kata/rockpaperscissors/draw.feature");
formatter.feature({
  "line": 1,
  "name": "Same Moves result in Draw",
  "description": "\r\nAs a player\r\nI want the same moves to draw\r\nSo that I can play with rules I\u0027m familiar with",
  "id": "same-moves-result-in-draw",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Rock Gesture",
  "description": "",
  "id": "same-moves-result-in-draw;rock-gesture",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Player One have chosen rock",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Player Two chooses rock",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Both should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 339822252,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 294365,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Both",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 247247,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Scissors Gesture",
  "description": "",
  "id": "same-moves-result-in-draw;scissors-gesture",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Player One have chosen scissors",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Player Two chooses scissors",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Both should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 258443,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 221590,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Both",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 134820,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Paper Gesture",
  "description": "",
  "id": "same-moves-result-in-draw;paper-gesture",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Player One have chosen paper",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Player Two chooses paper",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Both should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 481899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 291099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Both",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 142751,
  "status": "passed"
});
formatter.uri("it/mcella/kata/rockpaperscissors/paper-beats-rock.feature");
formatter.feature({
  "line": 1,
  "name": "Paper beats Rock",
  "description": "\r\nAs a player\r\nI want paper to beat rock\r\nSo that I can play with rules I\u0027m familiar with",
  "id": "paper-beats-rock",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Player One win",
  "description": "",
  "id": "paper-beats-rock;player-one-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Player One have chosen paper",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Player Two chooses rock",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Player One should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 217858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 300895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 139485,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Player Two win",
  "description": "",
  "id": "paper-beats-rock;player-two-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Player One have chosen rock",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Player Two chooses paper",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Player Two should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 226254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 186602,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 141817,
  "status": "passed"
});
formatter.uri("it/mcella/kata/rockpaperscissors/rock-beats-scissors.feature");
formatter.feature({
  "line": 1,
  "name": "Rock beats Scissors",
  "description": "\r\nAs a player\r\nI want rock to beat scissors\r\nSo that I can play with rules I\u0027m familiar with",
  "id": "rock-beats-scissors",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Player One win",
  "description": "",
  "id": "rock-beats-scissors;player-one-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Player One have chosen rock",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Player Two chooses scissors",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Player One should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 275238,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 197798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 171207,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Player Two win",
  "description": "",
  "id": "rock-beats-scissors;player-two-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Player One have chosen scissors",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Player Two chooses rock",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Player Two should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 222056,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "rock",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 186135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 134353,
  "status": "passed"
});
formatter.uri("it/mcella/kata/rockpaperscissors/scissors-beats-paper.feature");
formatter.feature({
  "line": 1,
  "name": "Scissors beats Paper",
  "description": "\r\nAs a player\r\nI want scissors to beat paper\r\nSo that I can play with rules I\u0027m familiar with",
  "id": "scissors-beats-paper",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Player One win",
  "description": "",
  "id": "scissors-beats-paper;player-one-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Player One have chosen scissors",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Player Two chooses paper",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Player One should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 227654,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 195465,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 139019,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Player Two win",
  "description": "",
  "id": "scissors-beats-paper;player-two-win",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Player One have chosen paper",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Player Two chooses scissors",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Player Two should win",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Player One",
      "offset": 0
    },
    {
      "val": "paper",
      "offset": 23
    }
  ],
  "location": "RockPaperScissorsSteps.java:22"
});
formatter.result({
  "duration": 313491,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    },
    {
      "val": "scissors",
      "offset": 19
    }
  ],
  "location": "RockPaperScissorsSteps.java:32"
});
formatter.result({
  "duration": 399328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Player Two",
      "offset": 0
    }
  ],
  "location": "RockPaperScissorsSteps.java:39"
});
formatter.result({
  "duration": 174939,
  "status": "passed"
});
});