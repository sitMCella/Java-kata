$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("it/mcella/kata/romannumerals/convert-arabic-to-roman.feature");
formatter.feature({
  "line": 1,
  "name": "Convert Arabic Number to Roman Number",
  "description": "\r\nAs a game developer\r\nI want to be able to convert a number to a numeral\r\nSo that I can label my game releases using Roman numerals",
  "id": "convert-arabic-number-to-roman-number",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter \u003cnumber\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "\u003cnumeral\u003e is returned",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;",
  "rows": [
    {
      "cells": [
        "number",
        "numeral"
      ],
      "line": 13,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;1"
    },
    {
      "cells": [
        "1",
        "I"
      ],
      "line": 14,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;2"
    },
    {
      "cells": [
        "3",
        "III"
      ],
      "line": 15,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;3"
    },
    {
      "cells": [
        "9",
        "IX"
      ],
      "line": 16,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;4"
    },
    {
      "cells": [
        "1066",
        "MLXVI"
      ],
      "line": 17,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;5"
    },
    {
      "cells": [
        "1989",
        "MCMLXXXIX"
      ],
      "line": 18,
      "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter 1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I is returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RomanNumeralsSteps.java:16"
});
formatter.result({
  "duration": 341634155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "RomanNumeralsSteps.java:20"
});
formatter.result({
  "duration": 4537687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I",
      "offset": 0
    }
  ],
  "location": "RomanNumeralsSteps.java:24"
});
formatter.result({
  "duration": 3626605,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter 3",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "III is returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RomanNumeralsSteps.java:16"
});
formatter.result({
  "duration": 54581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "RomanNumeralsSteps.java:20"
});
formatter.result({
  "duration": 250979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "III",
      "offset": 0
    }
  ],
  "location": "RomanNumeralsSteps.java:24"
});
formatter.result({
  "duration": 164209,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter 9",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "IX is returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RomanNumeralsSteps.java:16"
});
formatter.result({
  "duration": 50849,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 8
    }
  ],
  "location": "RomanNumeralsSteps.java:20"
});
formatter.result({
  "duration": 211793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IX",
      "offset": 0
    }
  ],
  "location": "RomanNumeralsSteps.java:24"
});
formatter.result({
  "duration": 137152,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter 1066",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "MLXVI is returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RomanNumeralsSteps.java:16"
});
formatter.result({
  "duration": 58779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1066",
      "offset": 8
    }
  ],
  "location": "RomanNumeralsSteps.java:20"
});
formatter.result({
  "duration": 244448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MLXVI",
      "offset": 0
    }
  ],
  "location": "RomanNumeralsSteps.java:24"
});
formatter.result({
  "duration": 135753,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Convert Arabic Number to Roman Number",
  "description": "",
  "id": "convert-arabic-number-to-roman-number;convert-arabic-number-to-roman-number;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I have started the converter",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter 1989",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "MCMLXXXIX is returned",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "RomanNumeralsSteps.java:16"
});
formatter.result({
  "duration": 59713,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1989",
      "offset": 8
    }
  ],
  "location": "RomanNumeralsSteps.java:20"
});
formatter.result({
  "duration": 225788,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MCMLXXXIX",
      "offset": 0
    }
  ],
  "location": "RomanNumeralsSteps.java:24"
});
formatter.result({
  "duration": 136686,
  "status": "passed"
});
});