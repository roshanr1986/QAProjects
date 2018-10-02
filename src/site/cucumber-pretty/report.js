$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testBranchAddress.feature");
formatter.feature({
  "line": 1,
  "name": "test branch address",
  "description": "",
  "id": "test-branch-address",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify branch has correct address in HomePage",
  "description": "",
  "id": "test-branch-address;verify-branch-has-correct-address-in-homepage",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate MT homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select \u003cbranchname\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fetch the \u003caddressprefix\u003e and \u003caddresssuffix\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the address with branch",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;",
  "rows": [
    {
      "cells": [
        "branchname",
        "addressprefix",
        "addresssuffix"
      ],
      "line": 12,
      "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;1"
    },
    {
      "cells": [
        "Agra",
        "Mercury Travels Ltd.",
        "C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001."
      ],
      "line": 13,
      "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;2"
    },
    {
      "cells": [
        "Ahmedabad",
        "Mercury Travels Ltd.",
        "103 B Abhijeet 1, 1st Floor, Mithakali Six Roads, Ahmedabad 380 006."
      ],
      "line": 14,
      "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;3"
    },
    {
      "cells": [
        "Bangalore",
        "Mercury Travels Ltd.",
        "125, Infantry Road, Bangalore 560 001."
      ],
      "line": 15,
      "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 55729411328,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify branch has correct address in HomePage",
  "description": "",
  "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate MT homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select Agra",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fetch the Mercury Travels Ltd. and C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001.",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the address with branch",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsTestBranchAddress.iNavigateMTHomepage()"
});
formatter.result({
  "duration": 1854497651,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agra",
      "offset": 9
    }
  ],
  "location": "stepsTestBranchAddress.iSelectBranchname(String)"
});
formatter.result({
  "duration": 1724632932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury Travels Ltd.",
      "offset": 12
    },
    {
      "val": "C/o Hotel Clarks Shiraz, 54, Taj Road, Agra 282 001.",
      "offset": 37
    }
  ],
  "location": "stepsTestBranchAddress.iFetchTheAddressprefixAndAddresssuffix(String,String)"
});
formatter.result({
  "duration": 366835653,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 197766,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "duration": 1212428054,
  "status": "passed"
});
formatter.after({
  "duration": 381452,
  "status": "passed"
});
formatter.before({
  "duration": 24824231063,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify branch has correct address in HomePage",
  "description": "",
  "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate MT homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select Ahmedabad",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fetch the Mercury Travels Ltd. and 103 B Abhijeet 1, 1st Floor, Mithakali Six Roads, Ahmedabad 380 006.",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the address with branch",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsTestBranchAddress.iNavigateMTHomepage()"
});
formatter.result({
  "duration": 318090,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ahmedabad",
      "offset": 9
    }
  ],
  "location": "stepsTestBranchAddress.iSelectBranchname(String)"
});
formatter.result({
  "duration": 516329173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury Travels Ltd.",
      "offset": 12
    },
    {
      "val": "103 B Abhijeet 1, 1st Floor, Mithakali Six Roads, Ahmedabad 380 006.",
      "offset": 37
    }
  ],
  "location": "stepsTestBranchAddress.iFetchTheAddressprefixAndAddresssuffix(String,String)"
});
formatter.result({
  "duration": 378322749,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 160005,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "duration": 2320181331,
  "status": "passed"
});
formatter.after({
  "duration": 235527,
  "status": "passed"
});
formatter.before({
  "duration": 28434441700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Verify branch has correct address in HomePage",
  "description": "",
  "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate MT homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select Bangalore",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I fetch the Mercury Travels Ltd. and 125, Infantry Road, Bangalore 560 001.",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Verify the address with branch",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsTestBranchAddress.iNavigateMTHomepage()"
});
formatter.result({
  "duration": 365452,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bangalore",
      "offset": 9
    }
  ],
  "location": "stepsTestBranchAddress.iSelectBranchname(String)"
});
formatter.result({
  "duration": 1289844340,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury Travels Ltd.",
      "offset": 12
    },
    {
      "val": "125, Infantry Road, Bangalore 560 001.",
      "offset": 37
    }
  ],
  "location": "stepsTestBranchAddress.iFetchTheAddressprefixAndAddresssuffix(String,String)"
});
formatter.result({
  "duration": 347668948,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 222087,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "duration": 697351402,
  "status": "passed"
});
formatter.after({
  "duration": 164485,
  "status": "passed"
});
});