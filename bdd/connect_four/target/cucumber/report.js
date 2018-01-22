$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("it/mcella/bdd/connectfour/add-token-to-grid.feature");
formatter.feature({
  "line": 1,
  "name": "Connect Four game play",
  "description": "\r\nAs a VP of Gaming\r\nI want players to be able to place tokens\r\nSo that they can play",
  "id": "connect-four-game-play",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Add token to grid",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "a grid with \u003cnumber\u003e tokens in column \u003ccolumn\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I place a token in that column",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "that token should be in row \u003crow\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid;",
  "rows": [
    {
      "cells": [
        "number",
        "column",
        "row"
      ],
      "line": 13,
      "id": "connect-four-game-play;add-token-to-grid;;1"
    },
    {
      "cells": [
        "0",
        "B",
        "1"
      ],
      "line": 14,
      "id": "connect-four-game-play;add-token-to-grid;;2"
    },
    {
      "cells": [
        "2",
        "D",
        "3"
      ],
      "line": 15,
      "id": "connect-four-game-play;add-token-to-grid;;3"
    },
    {
      "cells": [
        "5",
        "F",
        "6"
      ],
      "line": 16,
      "id": "connect-four-game-play;add-token-to-grid;;4"
    },
    {
      "cells": [
        "6",
        "A",
        "0"
      ],
      "line": 17,
      "id": "connect-four-game-play;add-token-to-grid;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Add token to grid",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "a grid with 0 tokens in column B",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I place a token in that column",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "that token should be in row 1",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 12
    },
    {
      "val": "B",
      "offset": 31
    }
  ],
  "location": "AddTokenSteps.java:19"
});
formatter.result({
  "duration": 405749106,
  "status": "passed"
});
formatter.match({
  "location": "AddTokenSteps.java:28"
});
formatter.result({
  "duration": 110562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 28
    }
  ],
  "location": "AddTokenSteps.java:32"
});
formatter.result({
  "duration": 406791,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Add token to grid",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "a grid with 2 tokens in column D",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I place a token in that column",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "that token should be in row 3",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 12
    },
    {
      "val": "D",
      "offset": 31
    }
  ],
  "location": "AddTokenSteps.java:19"
});
formatter.result({
  "duration": 321421,
  "status": "passed"
});
formatter.match({
  "location": "AddTokenSteps.java:28"
});
formatter.result({
  "duration": 53648,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    }
  ],
  "location": "AddTokenSteps.java:32"
});
formatter.result({
  "duration": 208061,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Add token to grid",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "a grid with 5 tokens in column F",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I place a token in that column",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "that token should be in row 6",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    },
    {
      "val": "F",
      "offset": 31
    }
  ],
  "location": "AddTokenSteps.java:19"
});
formatter.result({
  "duration": 310692,
  "status": "passed"
});
formatter.match({
  "location": "AddTokenSteps.java:28"
});
formatter.result({
  "duration": 71375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 28
    }
  ],
  "location": "AddTokenSteps.java:32"
});
formatter.result({
  "duration": 213659,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Add token to grid",
  "description": "",
  "id": "connect-four-game-play;add-token-to-grid;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "a grid with 6 tokens in column A",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I place a token in that column",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "that token should be in row 0",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 12
    },
    {
      "val": "A",
      "offset": 31
    }
  ],
  "location": "AddTokenSteps.java:19"
});
formatter.result({
  "duration": 1932261,
  "status": "passed"
});
formatter.match({
  "location": "AddTokenSteps.java:28"
});
formatter.result({
  "duration": 61578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 28
    }
  ],
  "location": "AddTokenSteps.java:32"
});
formatter.result({
  "duration": 763201,
  "status": "passed"
});
formatter.uri("it/mcella/bdd/connectfour/check-winner.feature");
formatter.feature({
  "line": 1,
  "name": "Check Connect Four Winner",
  "description": "\r\nAs a VP of Gaming\r\nI want my game to check for winners\r\nSo that a player can win the game",
  "id": "check-connect-four-winner",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Check winner",
  "description": "",
  "id": "check-connect-four-winner;check-winner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I have a grid like",
  "rows": [
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 9
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 10
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 11
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 12
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 13
    },
    {
      "cells": [
        "1",
        "1",
        "1",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 14
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I check for winners",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the winner should be Yellow",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckWinnerSteps.java:23"
});
formatter.result({
  "duration": 29603896,
  "status": "passed"
});
formatter.match({
  "location": "CheckWinnerSteps.java:28"
});
formatter.result({
  "duration": 1471354,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yellow",
      "offset": 21
    }
  ],
  "location": "CheckWinnerSteps.java:32"
});
formatter.result({
  "duration": 2726718,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Check winner",
  "description": "",
  "id": "check-connect-four-winner;check-winner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "I have a grid like",
  "rows": [
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 20
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 21
    },
    {
      "cells": [
        "2",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 22
    },
    {
      "cells": [
        "2",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 23
    },
    {
      "cells": [
        "2",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 24
    },
    {
      "cells": [
        "2",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 25
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I check for winners",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the winner should be Red",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckWinnerSteps.java:23"
});
formatter.result({
  "duration": 2225692,
  "status": "passed"
});
formatter.match({
  "location": "CheckWinnerSteps.java:28"
});
formatter.result({
  "duration": 2371241,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Red",
      "offset": 21
    }
  ],
  "location": "CheckWinnerSteps.java:32"
});
formatter.result({
  "duration": 286433,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Check winner",
  "description": "",
  "id": "check-connect-four-winner;check-winner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I have a grid like",
  "rows": [
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 31
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 32
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 33
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 34
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 35
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 36
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "I check for winners",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "the winner should be Undefined",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckWinnerSteps.java:23"
});
formatter.result({
  "duration": 1921064,
  "status": "passed"
});
formatter.match({
  "location": "CheckWinnerSteps.java:28"
});
formatter.result({
  "duration": 3392419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Undefined",
      "offset": 21
    }
  ],
  "location": "CheckWinnerSteps.java:32"
});
formatter.result({
  "duration": 259376,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Check winner",
  "description": "",
  "id": "check-connect-four-winner;check-winner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "I have a grid like",
  "rows": [
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 42
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 43
    },
    {
      "cells": [
        "2",
        "1",
        "2",
        "2",
        "0",
        "0",
        "0"
      ],
      "line": 44
    },
    {
      "cells": [
        "1",
        "1",
        "2",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 45
    },
    {
      "cells": [
        "2",
        "2",
        "1",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 46
    },
    {
      "cells": [
        "2",
        "1",
        "2",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 47
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 48,
  "name": "I check for winners",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "the winner should be Red",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckWinnerSteps.java:23"
});
formatter.result({
  "duration": 1878146,
  "status": "passed"
});
formatter.match({
  "location": "CheckWinnerSteps.java:28"
});
formatter.result({
  "duration": 2189771,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Red",
      "offset": 21
    }
  ],
  "location": "CheckWinnerSteps.java:32"
});
formatter.result({
  "duration": 314424,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "Check winner",
  "description": "",
  "id": "check-connect-four-winner;check-winner",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 52,
  "name": "I have a grid like",
  "rows": [
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 53
    },
    {
      "cells": [
        "0",
        "0",
        "0",
        "0",
        "0",
        "0",
        "0"
      ],
      "line": 54
    },
    {
      "cells": [
        "1",
        "1",
        "2",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 55
    },
    {
      "cells": [
        "1",
        "1",
        "2",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 56
    },
    {
      "cells": [
        "2",
        "2",
        "1",
        "2",
        "0",
        "0",
        "0"
      ],
      "line": 57
    },
    {
      "cells": [
        "2",
        "1",
        "2",
        "1",
        "0",
        "0",
        "0"
      ],
      "line": 58
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 59,
  "name": "I check for winners",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "the winner should be Yellow",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckWinnerSteps.java:23"
});
formatter.result({
  "duration": 2692196,
  "status": "passed"
});
formatter.match({
  "location": "CheckWinnerSteps.java:28"
});
formatter.result({
  "duration": 886824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yellow",
      "offset": 21
    }
  ],
  "location": "CheckWinnerSteps.java:32"
});
formatter.result({
  "duration": 1780180,
  "status": "passed"
});
});