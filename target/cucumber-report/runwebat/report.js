$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@mytest"
    }
  ]
});
formatter.scenario({
  "name": "Invalid login scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mytest"
    },
    {
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "name": "i navigate to the \"Home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.iNavigateToThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email id \"msudhirvarma@gmail.com\" and password \"incorrectPassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.iEnterEmailIdAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login error should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.loginErrorShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "valid login scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mytest"
    },
    {
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "name": "i navigate to the \"Home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.iNavigateToThePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email id \"msudhirvarma@gmail.com\" and password \"correctPassword15\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.iEnterEmailIdAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login page should be displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.loginPageShouldBeDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});