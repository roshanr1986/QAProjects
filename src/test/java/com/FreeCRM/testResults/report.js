$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "user try has valid login",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigate to \"https://www.freecrm.com/index.html\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.freecrm.com/index.html",
      "offset": 18
    }
  ],
  "location": "loginFeatureSteps.userNavigateTo(String)"
});
formatter.result({
  "duration": 722970797,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "user login to the system",
  "description": "",
  "id": "login;user-login-to-the-system",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "when user navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enter username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user log in successfully and view correct",
  "keyword": "Then "
});
formatter.match({
  "location": "loginFeatureSteps.whenUserNavigateToLoginPage()"
});
formatter.result({
  "duration": 18157781790,
  "status": "passed"
});
formatter.match({
  "location": "loginFeatureSteps.userEnterUsername()"
});
formatter.result({
  "duration": 603000162,
  "status": "passed"
});
formatter.match({
  "location": "loginFeatureSteps.userEnterPassword()"
});
formatter.result({
  "duration": 451699864,
  "status": "passed"
});
formatter.match({
  "location": "loginFeatureSteps.userClickOnLogin()"
});
formatter.result({
  "duration": 165809111209,
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat commonLibs.implementation.commonElements.click(commonElements.java:61)\r\n\tat com.FreeCRM.FCDashboard.clickHometab(FCDashboard.java:44)\r\n\tat com.FreeCRM.Steps.loginFeatureSteps.userClickOnLogin(loginFeatureSteps.java:59)\r\n\tat ✽.Then user click on login(login.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "loginFeatureSteps.userLogInSuccessfullyAndViewCorrect(String)"
});
formatter.result({
  "status": "skipped"
});
});