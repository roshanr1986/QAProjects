$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/mercuryTravels/cucumberFeatures/Demo.feature");
formatter.feature({
  "line": 2,
  "name": "update profile",
  "description": "As an employee i want to update my information such as contact,email,address\r\nso that my colleagues can view my latest details.",
  "id": "update-profile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTest"
    }
  ]
});
formatter.before({
  "duration": 397266,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User login to the profile",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill in username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill in my password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be logged in and view welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.iNavigateToHomepage()"
});
formatter.result({
  "duration": 266313998,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iFillInUsername()"
});
formatter.result({
  "duration": 63997,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iFillInMyPassword()"
});
formatter.result({
  "duration": 127391,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 109882,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iShouldBeLoggedInAndViewWelcomeMessage()"
});
formatter.result({
  "duration": 86940,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Update Name",
  "description": "",
  "id": "update-profile;update-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I click on update Name option",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I update \"Roshan\" with \"Roshan Ranasinghe\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click save",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should see update success message",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.iClickOnUpdateNameOption()"
});
formatter.result({
  "duration": 85128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Roshan",
      "offset": 10
    },
    {
      "val": "Roshan Ranasinghe",
      "offset": 24
    }
  ],
  "location": "DemoSteps.iUpdateWith(String,String)"
});
formatter.result({
  "duration": 4378373,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iClickSave()"
});
formatter.result({
  "duration": 88751,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iShouldSeeUpdateSuccessMessage()"
});
formatter.result({
  "duration": 88751,
  "status": "passed"
});
formatter.after({
  "duration": 82110,
  "status": "passed"
});
formatter.before({
  "duration": 124976,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User login to the profile",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I navigate to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I fill in username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I fill in my password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be logged in and view welcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.iNavigateToHomepage()"
});
formatter.result({
  "duration": 176295,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iFillInUsername()"
});
formatter.result({
  "duration": 86336,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iFillInMyPassword()"
});
formatter.result({
  "duration": 82109,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 71846,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iShouldBeLoggedInAndViewWelcomeMessage()"
});
formatter.result({
  "duration": 89958,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Updatge email",
  "description": "",
  "id": "update-profile;updatge-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "I click on update email",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I update old email with new email",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click save email",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see new email updated",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSteps.iClickOnUpdateEmail()"
});
formatter.result({
  "duration": 95995,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iUpdateOldEmailWithNewEmail()"
});
formatter.result({
  "duration": 77280,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iClickSaveEmail()"
});
formatter.result({
  "duration": 75468,
  "status": "passed"
});
formatter.match({
  "location": "DemoSteps.iShouldSeeNewEmailUpdated()"
});
formatter.result({
  "duration": 141881,
  "status": "passed"
});
formatter.after({
  "duration": 92373,
  "status": "passed"
});
});