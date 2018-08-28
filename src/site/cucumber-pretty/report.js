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
        "125, Infantry Road, Bangalore 560 001xxx."
      ],
      "line": 15,
      "id": "test-branch-address;verify-branch-has-correct-address-in-homepage;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17992617986,
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
  "duration": 213211433,
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
  "duration": 306533206,
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
  "duration": 285939397,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 1948895,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "duration": 332749107,
  "status": "passed"
});
formatter.after({
  "duration": 247536,
  "status": "passed"
});
formatter.before({
  "duration": 14245089877,
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
  "duration": 265045,
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
  "duration": 217149674,
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
  "duration": 245279453,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 56752,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "duration": 2098065414,
  "status": "passed"
});
formatter.after({
  "duration": 86940,
  "status": "passed"
});
formatter.before({
  "duration": 11842316988,
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
  "name": "I fetch the Mercury Travels Ltd. and 125, Infantry Road, Bangalore 560 001xxx.",
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
  "duration": 492054,
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
  "duration": 207870083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mercury Travels Ltd.",
      "offset": 12
    },
    {
      "val": "125, Infantry Road, Bangalore 560 001xxx.",
      "offset": 37
    }
  ],
  "location": "stepsTestBranchAddress.iFetchTheAddressprefixAndAddresssuffix(String,String)"
});
formatter.result({
  "duration": 251485369,
  "status": "passed"
});
formatter.match({
  "location": "stepsTestBranchAddress.verifyTheAddressWithBranch()"
});
formatter.result({
  "duration": 1180929,
  "error_message": "java.lang.AssertionError: expected [Mercury Travels Ltd.\n125, Infantry Road, Bangalore 560 001xxx.] but found [Mercury Travels Ltd.\n125, Infantry Road, Bangalore 560 001.]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat com.mercuryTravels.Steps.stepsTestBranchAddress.verifyTheAddressWithBranch(stepsTestBranchAddress.java:58)\r\n\tat ✽.Then Verify the address with branch(testBranchAddress.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepsTestBranchAddress.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1031115912,
  "status": "passed"
});
});