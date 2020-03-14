$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/feature/ApplicationLogin.feature");
formatter.feature({
  "line": 1,
  "name": "To verify Login functionality",
  "description": "",
  "id": "to-verify-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To Verify successful Login",
  "description": "",
  "id": "to-verify-login-functionality;to-verify-successful-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is having valid URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters Email ID",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Login is Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.luanchBrowser()"
});
formatter.result({
  "duration": 44737800951,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enterEmailID()"
});
formatter.result({
  "duration": 1182710284,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enterPassword()"
});
formatter.result({
  "duration": 125364425,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.clickOnLoginButton()"
});
formatter.result({
  "duration": 289968516,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.verifyLogin()"
});
formatter.result({
  "duration": 127391507,
  "status": "passed"
});
});